package de.iteratec.swet.laufbahnstufen;


import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;

import javax.persistence.*;
import java.util.List;

@Entity
public class Laufbahnstufe {

    @Id
    private String name;

    @Embedded
    private List<Kompetenzeinstufung> pflichtKompetenzen;

    @Embedded
    private List<Kompetenzeinstufung> optionalKompetenzen;

    public Laufbahnstufe(final String name, final List<Kompetenzeinstufung> pflichtKompetenzen, final List<Kompetenzeinstufung> optionalKompetenzen) {
        this.name = name;
        this.pflichtKompetenzen = pflichtKompetenzen;
        this.optionalKompetenzen = optionalKompetenzen;
    }

    public Laufbahnstufe() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Kompetenzeinstufung> getPflichtKompetenzen() {
        return pflichtKompetenzen;
    }

    public void setPflichtKompetenzen(final List<Kompetenzeinstufung> pflichtKompetenzen) {
        this.pflichtKompetenzen = pflichtKompetenzen;
    }

    public List<Kompetenzeinstufung> getOptionalKompetenzen() {
        return optionalKompetenzen;
    }

    public void setOptionalKompetenzen(final List<Kompetenzeinstufung> optionalKompetenzen) {
        this.optionalKompetenzen = optionalKompetenzen;
    }
}
