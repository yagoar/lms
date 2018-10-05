package de.iteratec.swet.laufbahnstufen;

import de.iteratec.swet.kompetenzen.Kompetenzeinstufung;

import java.util.List;

/**
 * Service Interface für die Laufbahnstufen
 */
public interface LaufbahnstufenService {
    /**
     * Liefert alle Laufbahnstufen in der Datenbank
     * @return list of all Laufbahnstufen
     */
    List<Laufbahnstufe> getAll();

    /**
     * Erstellt eine neue Laufbahnstufe
     * @param laufbahnstufe Laufbahnstufe to create
     * @return created Laufbahnstufe
     */
    Laufbahnstufe createLaufbahnstufe(Laufbahnstufe laufbahnstufe);

    /**
     * Liefert die drei passendsten Laufbahstufen, sortiert nach Stufe und nach Übereinstimmung
     * @param kompetenzen list of Kompetenzeinstufung
     * @return list of three most fitting Laufbahnstufen
     */
    List<Laufbahnstufe> getTopThreeLaufbahnstufen(List<Kompetenzeinstufung> kompetenzen);
}
