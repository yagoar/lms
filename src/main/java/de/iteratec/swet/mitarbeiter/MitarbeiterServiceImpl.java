package de.iteratec.swet.mitarbeiter;

import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;
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
    public Mitarbeiter getMitarbeiter(final String kuerzel) {
        return mitarbeiterRepository.findByKuerzel(kuerzel);
    }

    @Override
    public Mitarbeiter createMitarbeiter(String kuerzel, Mitarbeiter mitarbeiter) {
        mitarbeiter.setKuerzel(kuerzel);
        return mitarbeiterRepository.save(mitarbeiter);
    }

    @Override
    public Mitarbeiter updateMitarbeiter(String kuerzel, Mitarbeiter mitarbeiter) {
        Mitarbeiter savedMitarbeiter = mitarbeiterRepository.findByKuerzel(kuerzel);
        savedMitarbeiter.setVorname(mitarbeiter.getVorname());
        savedMitarbeiter.setNachname(mitarbeiter.getNachname());
        return mitarbeiterRepository.save(savedMitarbeiter);
    }

    @Override
    public void deleteMitarbeiter(final String kuerzel) {
        Mitarbeiter savedMitarbeiter = mitarbeiterRepository.findByKuerzel(kuerzel);
        mitarbeiterRepository.delete(savedMitarbeiter);
    }

    @Override
    public List<Kompetenzeinstufung> getKompetenzen(final String kuerzel) {
        Mitarbeiter savedMitarbeiter = mitarbeiterRepository.findByKuerzel(kuerzel);
        return savedMitarbeiter.getKompetenzen();
    }

    @Override
    public Mitarbeiter setKompetenzen(final String kuerzel, final List<Kompetenzeinstufung> kompetenzen) {
        Mitarbeiter savedMitarbeiter = mitarbeiterRepository.findByKuerzel(kuerzel);
        savedMitarbeiter.setKompetenzen(kompetenzen);
        return mitarbeiterRepository.save(savedMitarbeiter);
    }

    @Override
    public List<Laufbahnstufe> getLaufbahnstufen(final String kuerzel) {
        Mitarbeiter savedMitarbeiter = mitarbeiterRepository.findByKuerzel(kuerzel);
        return laufbahnstufenService.getMostFittingLaufbahnstufen(savedMitarbeiter.getKompetenzen());
    }
}
