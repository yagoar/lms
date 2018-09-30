package de.iteratec.swet.mitarbeiter;

import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;
import de.iteratec.swet.laufbahnstufen.Laufbahnstufe;

import java.util.List;

public interface MitarbeiterService {
    Mitarbeiter getMitarbeiter(String kuerzel);

    Mitarbeiter createMitarbeiter(String kuerzel, Mitarbeiter mitarbeiter);

    Mitarbeiter updateMitarbeiter(String kuerzel, Mitarbeiter mitarbeiter);

    void deleteMitarbeiter(String kuerzel);

    List<Kompetenzeinstufung> getKompetenzen(String kuerzel);

    Mitarbeiter setKompetenzen(String kuerzel, List<Kompetenzeinstufung> kompetenzen);

    List<Laufbahnstufe> getLaufbahnstufen(String kuerzel);
}
