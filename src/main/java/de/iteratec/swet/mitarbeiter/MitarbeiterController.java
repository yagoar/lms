package de.iteratec.swet.mitarbeiter;

import de.iteratec.swet.kompetenzstufen.Kompetenzeinstufung;
import de.iteratec.swet.laufbahnstufen.Laufbahnstufe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/mitarbeiter")
public class MitarbeiterController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MitarbeiterController.class);

    @Autowired
    private MitarbeiterService mitarbeiterService;

    @PostMapping("/{kuerzel}")
    public Mitarbeiter createMitarbeiter(@PathVariable String kuerzel, @RequestBody Mitarbeiter mitarbeiter) {
        LOGGER.info("got Mitarbeiter: {}", mitarbeiter);
        return mitarbeiterService.createMitarbeiter(kuerzel, mitarbeiter);
    }

    @PutMapping("/{kuerzel}")
    public Mitarbeiter updateMitarbeiter(@PathVariable String kuerzel, @RequestBody Mitarbeiter mitarbeiter) {
        LOGGER.info("got Mitarbeiter: {}", mitarbeiter);
        return mitarbeiterService.updateMitarbeiter(kuerzel, mitarbeiter);
    }

    @GetMapping("/{kuerzel}/kompetenzbereiche")
    public List<Kompetenzeinstufung> getMitarbeiterKompetenzen(@PathVariable String kuerzel) {
        LOGGER.info("got Mitarbeiter: {}", kuerzel);
        return mitarbeiterService.getKompetenzen(kuerzel);
    }

    @PostMapping("/{kuerzel}/kompetenzbereiche")
    public Mitarbeiter setMitarbeiterKompetenzen(@PathVariable String kuerzel,
                                          @RequestBody List<Kompetenzeinstufung> kompetenzen) {
        LOGGER.info("got Mitarbeiter: {}", kuerzel);
        return mitarbeiterService.setKompetenzen(kuerzel, kompetenzen);
    }

    @GetMapping("/{kuerzel}/laufbahnstufen")
    public List<Laufbahnstufe> getMitarbeiterLaufbahnstufen(@PathVariable String kuerzel) {
        LOGGER.info("got Mitarbeiter: {}", kuerzel);
        try {
            return mitarbeiterService.getLaufbahnstufen(kuerzel);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            return new ArrayList<>();
        }
    }

    @DeleteMapping("/{kuerzel}")
    public void deleteMitarbeiter(@PathVariable String kuerzel) {
        LOGGER.info("got Mitarbeiter: {}", kuerzel);
        mitarbeiterService.deleteMitarbeiter(kuerzel);
    }

    @GetMapping("/{kuerzel}")
    public Mitarbeiter getMitarbeiter(@PathVariable String kuerzel) {
        LOGGER.info("got Mitarbeiter: {}", kuerzel);
        return mitarbeiterService.getMitarbeiter(kuerzel);
    }
}
