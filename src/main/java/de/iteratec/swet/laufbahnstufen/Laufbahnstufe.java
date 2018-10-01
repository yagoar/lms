package de.iteratec.swet.laufbahnstufen;


import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;

import javax.persistence.*;
import java.util.List;

@Entity
public class Laufbahnstufe {

    @Id
    private Long id;

    private int stufe;

    private String name;

    @ElementCollection
    private List<Kompetenzeinstufung> pflichtKompetenzen;

    @ElementCollection
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

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public int getStufe() {
        return stufe;
    }

    public void setStufe(final int stufe) {
        this.stufe = stufe;
    }
}
