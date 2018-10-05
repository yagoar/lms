package de.iteratec.swet.kompetenzen;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;

/**
 * Repräsentiert den Zusammenhang zwischen Kompetenzbereich (z.B. SE) und Kompetenzstufe (z.B. GL). Wird für die Definition der
 * Laufbahnstufen-Vorlagen und für den Kompetenzstand der Mitarbeiter verwendet
 */
@Embeddable
public class Kompetenzeinstufung {

    @Enumerated(EnumType.STRING)
    private Kompetenzbereich kompetenzbereich;

    @Enumerated(EnumType.STRING)
    private Kompetenzstufe kompetenzstufe;

    public Kompetenzeinstufung(final Kompetenzbereich kompetenzbereich, final Kompetenzstufe kompetenzstufe) {
        this.kompetenzbereich = kompetenzbereich;
        this.kompetenzstufe = kompetenzstufe;
    }

    public Kompetenzeinstufung() {
    }

    public Kompetenzbereich getKompetenzbereich() {
        return kompetenzbereich;
    }

    public void setKompetenzbereich(final Kompetenzbereich kompetenzbereich) {
        this.kompetenzbereich = kompetenzbereich;
    }

    public Kompetenzstufe getKompetenzstufe() {
        return kompetenzstufe;
    }

    public void setKompetenzstufe(final Kompetenzstufe kompetenzstufe) {
        this.kompetenzstufe = kompetenzstufe;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kompetenzeinstufung that = (Kompetenzeinstufung) o;

        // Damit eine Kompetenzeinstufung A in einer Kompetenzeinstufung A "enthalten" ist müssen die Kompetenzbereiche
        // gleich sein und der ordinale Wert der Kompetenzstufe Kompetenzeinstufung A niedrieger bzw. gleich wie die der Kompetenzeinstufung B
        // Beispiel: SE-GL // SE-FU
        // GL hat Ordinalwert 0, FU hat Ordinalwert 1, also ist SE-GL in SE-FU enthalten
        return getKompetenzbereich() == that.getKompetenzbereich() &&
                getKompetenzstufe().ordinal() <= that.getKompetenzstufe().ordinal();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKompetenzbereich(), getKompetenzstufe());
    }
}
