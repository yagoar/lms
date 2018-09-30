package de.iteratec.swet.mitarbeiter;

import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;
import de.iteratec.swet.kompetenzstufen.Kompetenzstufe;

import javax.persistence.*;
import java.util.List;

@Entity
public class Mitarbeiter {
    @Id
    private String kuerzel;

    private String vorname;

    private String nachname;

    @Embedded
    private List<Kompetenzeinstufung> kompetenzen;

    public Mitarbeiter(final String vorname, final String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Mitarbeiter() {
    }

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(final String kuerzel) {
        this.kuerzel = kuerzel;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(final String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(final String nachname) {
        this.nachname = nachname;
    }

    public List<Kompetenzeinstufung> getKompetenzen() {
        return kompetenzen;
    }

    public void setKompetenzen(final List<Kompetenzeinstufung> kompetenzen) {
        this.kompetenzen = kompetenzen;
    }
}
