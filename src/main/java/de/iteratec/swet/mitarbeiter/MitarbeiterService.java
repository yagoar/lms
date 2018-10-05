package de.iteratec.swet.mitarbeiter;

import de.iteratec.swet.kompetenzen.Kompetenzeinstufung;
import de.iteratec.swet.laufbahnstufen.Laufbahnstufe;

import java.util.List;

/**
 * Service Interface für die Mitarbeiter
 */
public interface MitarbeiterService {
    /**
     * Liefert den Mitarbeiter mit dem passenden Kürzel, falls vorhanden
     * @param kuerzel of the Mitarbeiter
     * @return Mitarbeiter
     * @throws MitarbeiterNotFoundException Mitarbeiter not found
     */
    Mitarbeiter getMitarbeiter(String kuerzel) throws MitarbeiterNotFoundException;

    /**
     * Erstellt einen neuen Mitarbeiter
     * @param kuerzel of the Mitarbeiter
     * @param mitarbeiter to create
     * @return created Mitarbeiter
     */
    Mitarbeiter createMitarbeiter(String kuerzel, Mitarbeiter mitarbeiter);

    /**
     * Aktualisiert die Daten eines Mitarbeiters, falls vorhanden
     * @param kuerzel of the Mitarbeiter
     * @param mitarbeiter to update
     * @return updated Mitarbeiter
     * @throws MitarbeiterNotFoundException Mitarbeiter not found
     */
    Mitarbeiter updateMitarbeiter(String kuerzel, Mitarbeiter mitarbeiter) throws MitarbeiterNotFoundException;

    /**
     * Löscht einen Mitarbeiter, falls vorhanden
     * @param kuerzel of the Mitarbeiter
     * @throws MitarbeiterNotFoundException Mitarbeiter not found
     */
    void deleteMitarbeiter(String kuerzel) throws  MitarbeiterNotFoundException;

    /**
     * Liefert die Kompetenzen eines Mitarbeiters, falls vorhanden
     * @param kuerzel of the Mitarbeiter
     * @return list of Kompetenzeinstufungen
     * @throws MitarbeiterNotFoundException Mitarbeiter not found
     */
    List<Kompetenzeinstufung> getKompetenzen(String kuerzel) throws  MitarbeiterNotFoundException;

    /**
     * Setzt die Kompetenzen eines Mitarbeiters, falls vorhanden
     * @param kuerzel of the Mitarbeiter
     * @param kompetenzen list of Kompetenzeinstufungen
     * @return updated Mitarbeiter
     * @throws MitarbeiterNotFoundException Mitarbeiter not found
     */
    Mitarbeiter setKompetenzen(String kuerzel, List<Kompetenzeinstufung> kompetenzen) throws  MitarbeiterNotFoundException;

    /**
     * Liefert die Lister der passendsten Laufbahnstufen (maximal 3)
     * @param kuerzel of the Mitarbeiter
     * @return list of Laufbahnstufen
     * @throws MitarbeiterNotFoundException Mitarbeiter not found
     */
    List<Laufbahnstufe> getLaufbahnstufen(String kuerzel) throws MitarbeiterNotFoundException;
}
