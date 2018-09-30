package de.iteratec.swet.kompetenzstufen;

import de.iteratec.swet.kompetenzbereiche.Kompetenzbereich;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;

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
        return getKompetenzbereich() == that.getKompetenzbereich() &&
                getKompetenzstufe() == that.getKompetenzstufe();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKompetenzbereich(), getKompetenzstufe());
    }
}
