package de.iteratec.swet;

import de.iteratec.swet.kompetenzen.Kompetenzbereich;
import de.iteratec.swet.kompetenzen.Kompetenzeinstufung;
import de.iteratec.swet.kompetenzen.Kompetenzstufe;
import de.iteratec.swet.laufbahnstufen.Laufbahnstufe;
import de.iteratec.swet.mitarbeiter.Mitarbeiter;
import de.iteratec.swet.mitarbeiter.MitarbeiterNotFoundException;
import de.iteratec.swet.mitarbeiter.MitarbeiterService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Integrationstest für Mitarbeiter-Testszenarien
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MitarbeiterServiceImplIntegrationTest {

    @Autowired
    private MitarbeiterService mitarbeiterService;

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void createMitarbeiter_shouldCreateNewMitarbeiter() {
        Mitarbeiter ma = createMitarbeiter();
        Mitarbeiter savedMa = mitarbeiterService.createMitarbeiter("mmu", ma);

        assertEquals("mmu", savedMa.getKuerzel());
        assertEquals(ma.getVorname(), savedMa.getVorname());
        assertEquals(ma.getNachname(), savedMa.getNachname());
    }

    @Test
    public void updateMitarbeiter_shouldThrowExceptionIfMaNotFound() throws MitarbeiterNotFoundException {
        exception.expect(MitarbeiterNotFoundException.class);
        Mitarbeiter maModified = createMitarbeiter();
        mitarbeiterService.updateMitarbeiter("mmu", maModified);
    }

    @Test
    public void updateMitarbeiter_shouldUpdateMitarbeiter() throws MitarbeiterNotFoundException {
        Mitarbeiter ma = createMitarbeiter();
        mitarbeiterService.createMitarbeiter("mmu", ma);

        Mitarbeiter maModified = createMitarbeiter();
        Mitarbeiter updatedMa = mitarbeiterService.updateMitarbeiter("mmu", maModified);

        assertEquals("mmu", updatedMa.getKuerzel());
        assertEquals(maModified.getVorname(), updatedMa.getVorname());
        assertEquals(maModified.getNachname(), updatedMa.getNachname());
    }

    @Test
    public void deleteMitarbeiter_shouldDeleteMitarbeiter() throws MitarbeiterNotFoundException {
        Mitarbeiter ma = createMitarbeiter();
        mitarbeiterService.createMitarbeiter("mmu", ma);

        mitarbeiterService.deleteMitarbeiter("mmu");

        exception.expect(MitarbeiterNotFoundException.class);
        mitarbeiterService.getMitarbeiter("mmmu");
    }

    @Test
    public void setKompetenzen_shouldSetKompetenzenForMa() throws MitarbeiterNotFoundException {
        Mitarbeiter ma = createMitarbeiter();
        mitarbeiterService.createMitarbeiter("mmu", ma);

        List<Kompetenzeinstufung> kompetenzen = generateJuniorKompetenzen();

        Mitarbeiter savedMa = mitarbeiterService.setKompetenzen("mmu", kompetenzen);

        assertEquals(kompetenzen.size(), savedMa.getKompetenzen().size());
        assertEquals(kompetenzen.get(0).getKompetenzbereich(), savedMa.getKompetenzen().get(0).getKompetenzbereich());
        assertEquals(kompetenzen.get(0).getKompetenzstufe(), savedMa.getKompetenzen().get(0).getKompetenzstufe());
    }

    @Test
    public void getLaufbahnstufen_shouldReturnJuniorLaufbahnstufeForNoMatching() throws Exception {
        Mitarbeiter ma = createMitarbeiter();
        mitarbeiterService.createMitarbeiter("mmu", ma);

        List<Kompetenzeinstufung> kompetenzen = generateJuniorKompetenzen();

        mitarbeiterService.setKompetenzen("mmu", kompetenzen);

        List<Laufbahnstufe> laufbahnstufen = mitarbeiterService.getLaufbahnstufen("mmu");
        assertFalse(laufbahnstufen.isEmpty());
        assertEquals(1, laufbahnstufen.size());
        assertEquals("Junior", laufbahnstufen.get(0).getName());
    }

    @Test
    public void getLaufbahnstufen_shouldCorrectTopThreeLaufbahnstufenForAdvancedKompetenzen() throws Exception {
        Mitarbeiter ma = createMitarbeiter();
        mitarbeiterService.createMitarbeiter("mmu", ma);

        List<Kompetenzeinstufung> kompetenzen = generateAdvancedKompetenzen();
        mitarbeiterService.setKompetenzen("mmu", kompetenzen);

        List<Laufbahnstufe> laufbahnstufen = mitarbeiterService.getLaufbahnstufen("mmu");
        assertFalse(laufbahnstufen.isEmpty());
        assertEquals(3, laufbahnstufen.size());

        assertEquals("Senior Solution Architect / Senior Software Architect / Senior Lead Software Engineer",
                laufbahnstufen.get(0).getName());
        assertEquals("Software Architect / Lead Software Engineer",
                laufbahnstufen.get(1).getName());
        assertEquals("Project Manager",
                laufbahnstufen.get(2).getName());
    }

    private Mitarbeiter createMitarbeiter() {
        return new Mitarbeiter("Max", "Muster");
    }

    private List<Kompetenzeinstufung> generateJuniorKompetenzen() {
        List<Kompetenzeinstufung> kompetenzen = new ArrayList<>();
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.SE, Kompetenzstufe.GL));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.SKF, Kompetenzstufe.GL));
        return kompetenzen;
    }

    private List<Kompetenzeinstufung> generateAdvancedKompetenzen() {
        List<Kompetenzeinstufung> kompetenzen = new ArrayList<>();
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.SE, Kompetenzstufe.EX));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.AM, Kompetenzstufe.FU));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.SA, Kompetenzstufe.EX));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.QM, Kompetenzstufe.FU));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.ITM, Kompetenzstufe.GL));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.PM, Kompetenzstufe.FU));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.SKF, Kompetenzstufe.FU));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.UDH, Kompetenzstufe.FU));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.BPK, Kompetenzstufe.EX));
        kompetenzen.add(new Kompetenzeinstufung(Kompetenzbereich.AKQ, Kompetenzstufe.FU));
        return kompetenzen;
    }
}
