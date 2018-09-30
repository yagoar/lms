package de.iteratec.swet.laufbahnstufen;

import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;

import java.util.List;

public interface LaufbahnstufenService {
    List<Laufbahnstufe> getAll();

    Laufbahnstufe createLaufbahnstufe(Laufbahnstufe laufbahnstufe);

    List<Laufbahnstufe> getMostFittingLaufbahnstufen(List<Kompetenzeinstufung> kompetenzen);
}
