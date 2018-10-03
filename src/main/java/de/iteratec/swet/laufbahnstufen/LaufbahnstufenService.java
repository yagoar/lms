package de.iteratec.swet.laufbahnstufen;

import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;

import java.util.List;

public interface LaufbahnstufenService {
    /**
     * Returns all stored Laufbahnstufen
     * @return list of all Laufbahnstufen
     */
    List<Laufbahnstufe> getAll();

    /**
     * Creates a new Laufbahnstufe
     * @param laufbahnstufe Laufbahnstufe to create
     * @return created Laufbahnstufe
     */
    Laufbahnstufe createLaufbahnstufe(Laufbahnstufe laufbahnstufe);

    /**
     * Returns the three most fitting Laufbahnstufen for the combination of Kompetenzen provided
     * @param kompetenzen list of Kompetenzeinstufung
     * @return list of three most fitting Laufbahnstufen
     */
    List<Laufbahnstufe> getTopThreeLaufbahnstufen(List<Kompetenzeinstufung> kompetenzen);
}
