package de.iteratec.swet.kompetenzen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * REST Controller für die Kompetenzbereiche Endpunkte
 */
@RestController
@RequestMapping(value = "api/kompetenzbereiche")
public class KompetenzbereicheController {

    @GetMapping
    public Iterable<Kompetenzbereich> getKompetenzbereiche() {
        return Arrays.asList(Kompetenzbereich.values());
    }
}
