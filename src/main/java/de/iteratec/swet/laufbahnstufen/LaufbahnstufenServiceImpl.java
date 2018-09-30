package de.iteratec.swet.laufbahnstufen;

import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Laufbahnstufe> getMostFittingLaufbahnstufen(final List<Kompetenzeinstufung> kompetenzen) {
        List<Laufbahnstufe> laufbahnstufen = new ArrayList<>();
        getAll().forEach(laufbahnstufe -> {
            boolean fulfillsMandatory = kompetenzen.containsAll(laufbahnstufe.getPflichtKompetenzen());
            boolean fulfillsOptional = checkOptionalKompetenzen(laufbahnstufe.getOptionalKompetenzen(), kompetenzen);
            if (fulfillsMandatory && fulfillsOptional) {
                laufbahnstufen.add(laufbahnstufe);
            }
        });
        return laufbahnstufen;
    }

    private boolean checkOptionalKompetenzen(final List<Kompetenzeinstufung> optionalKompetenzen,
                                              final List<Kompetenzeinstufung> givenKompetenzen) {
        List<Kompetenzeinstufung> matchingKompetenzen =
                optionalKompetenzen.stream().filter(givenKompetenzen::contains).collect(Collectors.toList());

        return !matchingKompetenzen.isEmpty();
    }

}
