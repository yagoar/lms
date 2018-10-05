package de.iteratec.swet.mitarbeiter;

import de.iteratec.swet.kompetenzen.Kompetenzeinstufung;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller für die Mitarbeiter Endpunkte
 */
@RestController
@RequestMapping(value = "api/mitarbeiter")
public class MitarbeiterController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MitarbeiterController.class);

    @Autowired
    private MitarbeiterService mitarbeiterService;

    @GetMapping("/{kuerzel}")
    public ResponseEntity getMitarbeiter(@PathVariable String kuerzel) {
        if (validateKuerzel(kuerzel)) return ResponseEntity.badRequest().build();
        try {
            return ResponseEntity.ok(mitarbeiterService.getMitarbeiter(kuerzel));
        } catch (MitarbeiterNotFoundException e) {
            LOGGER.error("Mitarbeiter with Kuerzel {} not found.", kuerzel);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{kuerzel}")
    public ResponseEntity createMitarbeiter(@PathVariable String kuerzel, @RequestBody Mitarbeiter mitarbeiter) {
        if (kuerzel == null || kuerzel.isEmpty()) {
            LOGGER.error("Tried to create Mitarbeiter without Kuerzel");
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(mitarbeiterService.createMitarbeiter(kuerzel, mitarbeiter));
    }

    @PutMapping("/{kuerzel}")
    public ResponseEntity updateMitarbeiter(@PathVariable String kuerzel, @RequestBody Mitarbeiter mitarbeiter) {
        if (validateKuerzel(kuerzel)) return ResponseEntity.badRequest().build();

        try {
            Mitarbeiter updatedMitarbeiter = mitarbeiterService.updateMitarbeiter(kuerzel, mitarbeiter);
            LOGGER.info("Updated Mitarbeiter: {}", kuerzel);
            return ResponseEntity.ok(updatedMitarbeiter);
        } catch (MitarbeiterNotFoundException e) {
            LOGGER.error("Mitarbeiter with Kuerzel {} not found.", kuerzel);
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{kuerzel}")
    public ResponseEntity deleteMitarbeiter(@PathVariable String kuerzel) {
        if (validateKuerzel(kuerzel)) return ResponseEntity.badRequest().build();
        try {
            mitarbeiterService.deleteMitarbeiter(kuerzel);
            return ResponseEntity.ok(null);
        } catch (MitarbeiterNotFoundException e) {
            LOGGER.error("Mitarbeiter with Kuerzel {} not found.", kuerzel);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{kuerzel}/kompetenzbereiche")
    public ResponseEntity getMitarbeiterKompetenzen(@PathVariable String kuerzel) {
        if (validateKuerzel(kuerzel)) return ResponseEntity.badRequest().build();

        try {
            LOGGER.info("Getting Kompetenzen for Mitarbeiter: {}", kuerzel);
            return ResponseEntity.ok(mitarbeiterService.getKompetenzen(kuerzel));
        } catch (MitarbeiterNotFoundException e) {
            LOGGER.error("Mitarbeiter with Kuerzel {} not found.", kuerzel);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{kuerzel}/kompetenzbereiche")
    public ResponseEntity setMitarbeiterKompetenzen(@PathVariable String kuerzel,
                                                    @RequestBody List<Kompetenzeinstufung> kompetenzen) {
        if (validateKuerzel(kuerzel)) return ResponseEntity.badRequest().build();

        try {
            Mitarbeiter mitarbeiter = mitarbeiterService.setKompetenzen(kuerzel, kompetenzen);
            LOGGER.info("Kompetenzen set for Mitarbeiter {}.", kuerzel);
            return ResponseEntity.ok(mitarbeiter);
        } catch (MitarbeiterNotFoundException e) {
            LOGGER.error("Mitarbeiter with Kuerzel {} not found.", kuerzel);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{kuerzel}/laufbahnstufen")
    public ResponseEntity getMitarbeiterLaufbahnstufen(@PathVariable String kuerzel) {
        if (validateKuerzel(kuerzel)) return ResponseEntity.badRequest().build();
        try {
            return ResponseEntity.ok(mitarbeiterService.getLaufbahnstufen(kuerzel));
        } catch (Exception e) {
            LOGGER.error("Mitarbeiter with Kuerzel {} not found.", kuerzel);
            return ResponseEntity.notFound().build();
        }
    }

    private boolean validateKuerzel(@PathVariable final String kuerzel) {
        if (kuerzel == null || kuerzel.isEmpty()) {
            LOGGER.error("Tried to update Mitarbeiter without Kuerzel");
            return true;
        }
        return false;
    }
}
