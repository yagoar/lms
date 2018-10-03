package de.iteratec.swet.laufbahnstufen;

import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaufbahnstufenServiceImpl implements LaufbahnstufenService {

    @Autowired
    private LaufbahnstufeRepository laufbahnstufeRepository;

    @Override
    public List<Laufbahnstufe> getAll() {
        return laufbahnstufeRepository.findAll();
    }

    @Override
    public Laufbahnstufe createLaufbahnstufe(final Laufbahnstufe laufbahnstufe) {
        return laufbahnstufeRepository.save(laufbahnstufe);
    }

    @Override
    public List<Laufbahnstufe> getTopThreeLaufbahnstufen(final List<Kompetenzeinstufung> kompetenzen) {
        List<Laufbahnstufe> laufbahnstufen = new ArrayList<>();
        getAll().forEach(laufbahnstufe -> computeLaufbahnstufe(kompetenzen, laufbahnstufen, laufbahnstufe));

        return sortAndGetTopThree(laufbahnstufen);
    }

    private void computeLaufbahnstufe(final List<Kompetenzeinstufung> kompetenzen,
                                      final List<Laufbahnstufe> laufbahnstufen, final Laufbahnstufe laufbahnstufe) {

        // Pflichtkompetenzen prüfen (nur erfüllt wenn alle Kompetenzen Übereinstimmen)
        boolean fulfillsMandatory = kompetenzen.containsAll(laufbahnstufe.getPflichtKompetenzen());

        // Optionale Kompetenzen prüfen (erfüllt wenn mindestens eine Kompetenz übereinstimmt)
        List<Kompetenzeinstufung> matchingOptional =
                filterOptionalKompetenzen(laufbahnstufe.getOptionalKompetenzen(), kompetenzen);
        boolean fulfillsOptional = !matchingOptional.isEmpty();

        if (fulfillsMandatory && fulfillsOptional) {
            // Genaue Übereinstimmung berechnen für die spätere Sortierung
            laufbahnstufe.setMaUebereinstimmung(
                    (double) matchingOptional.size() / (double) laufbahnstufe.getOptionalKompetenzen().size());

            laufbahnstufen.add(laufbahnstufe);
        }
    }

    private List<Kompetenzeinstufung> filterOptionalKompetenzen(final List<Kompetenzeinstufung> optionalKompetenzen,
                                                                final List<Kompetenzeinstufung> givenKompetenzen) {
        return optionalKompetenzen.stream()
                .filter(givenKompetenzen::contains)
                .collect(Collectors.toList());
    }

    private List<Laufbahnstufe> sortAndGetTopThree(List<Laufbahnstufe> matchingLaufbahnstufen) {
        return matchingLaufbahnstufen.stream()
                .sorted(Comparator.comparing(Laufbahnstufe::getStufe).thenComparing(Laufbahnstufe::getMaUebereinstimmung))
                .limit(3)
                .collect(Collectors.toList());
    }
}
