package de.iteratec.swet.laufbahnstufen;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.iteratec.swet.kompetenzen.Kompetenzeinstufung;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class Laufbahnstufe {

    @Id
    private Long id;

    private int stufe;

    private String name;

    @Enumerated(EnumType.STRING)
    private Laufbahn laufbahn;

    @JsonIgnore
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE) // Notwendig für den Zugriff auf die Kompetenzen im LaufbahnstufenService
    private List<Kompetenzeinstufung> pflichtKompetenzen;

    @JsonIgnore
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Kompetenzeinstufung> optionalKompetenzen;

    @Transient
    private double maUebereinstimmung; // Verhältnis erfüllte optionale Kompetenzen zu mögliche optionale Kompetenzen

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

    public Laufbahn getLaufbahn() {
        return laufbahn;
    }

    public void setLaufbahn(final Laufbahn laufbahn) {
        this.laufbahn = laufbahn;
    }

    public double getMaUebereinstimmung() {
        return maUebereinstimmung;
    }

    public void setMaUebereinstimmung(final double maUebereinstimmung) {
        this.maUebereinstimmung = maUebereinstimmung;
    }
}
