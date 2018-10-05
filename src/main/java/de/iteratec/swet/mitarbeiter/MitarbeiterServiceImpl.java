package de.iteratec.swet.mitarbeiter;

import de.iteratec.swet.kompetenzen.Kompetenzeinstufung;
import de.iteratec.swet.laufbahnstufen.Laufbahnstufe;
import de.iteratec.swet.laufbahnstufen.LaufbahnstufenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MitarbeiterServiceImpl implements MitarbeiterService {

    @Autowired
    private MitarbeiterRepository mitarbeiterRepository;

    @Autowired
    private LaufbahnstufenService laufbahnstufenService;

    @Override
    public Mitarbeiter getMitarbeiter(final String kuerzel) throws MitarbeiterNotFoundException {
        return findMitarbeiter(kuerzel);
    }

    @Override
    public Mitarbeiter createMitarbeiter(String kuerzel, Mitarbeiter mitarbeiter) {
        mitarbeiter.setKuerzel(kuerzel);
        return mitarbeiterRepository.save(mitarbeiter);
    }

    @Override
    public Mitarbeiter updateMitarbeiter(String kuerzel, Mitarbeiter mitarbeiter) throws MitarbeiterNotFoundException {
        Mitarbeiter savedMitarbeiter = findMitarbeiter(kuerzel);
        savedMitarbeiter.setVorname(mitarbeiter.getVorname());
        savedMitarbeiter.setNachname(mitarbeiter.getNachname());
        return mitarbeiterRepository.save(savedMitarbeiter);
    }

    @Override
    public void deleteMitarbeiter(final String kuerzel) throws MitarbeiterNotFoundException {
        Mitarbeiter savedMitarbeiter = findMitarbeiter(kuerzel);
        mitarbeiterRepository.delete(savedMitarbeiter);
    }

    @Override
    public List<Kompetenzeinstufung> getKompetenzen(final String kuerzel) throws MitarbeiterNotFoundException {
        Mitarbeiter savedMitarbeiter = findMitarbeiter(kuerzel);
        return savedMitarbeiter.getKompetenzen();
    }

    @Override
    public Mitarbeiter setKompetenzen(final String kuerzel, final List<Kompetenzeinstufung> kompetenzen) throws MitarbeiterNotFoundException {
        Mitarbeiter savedMitarbeiter = findMitarbeiter(kuerzel);
        savedMitarbeiter.setKompetenzen(kompetenzen);
        return mitarbeiterRepository.save(savedMitarbeiter);
    }

    @Override
    public List<Laufbahnstufe> getLaufbahnstufen(final String kuerzel) throws MitarbeiterNotFoundException {
        Mitarbeiter savedMitarbeiter = findMitarbeiter(kuerzel);
        return laufbahnstufenService.getTopThreeLaufbahnstufen(savedMitarbeiter.getKompetenzen());
    }

    private Mitarbeiter findMitarbeiter(final String kuerzel) throws MitarbeiterNotFoundException {
        Mitarbeiter savedMitarbeiter = mitarbeiterRepository.findByKuerzel(kuerzel);
        if (savedMitarbeiter == null) {
            throw new MitarbeiterNotFoundException("Mitarbeiter with Kuerzel " + kuerzel + " does not exist.");
        }
        return savedMitarbeiter;
    }
}
