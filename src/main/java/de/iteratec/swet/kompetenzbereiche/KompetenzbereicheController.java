package de.iteratec.swet.kompetenzbereiche;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(value = "api/kompetenzbereiche")
public class KompetenzbereicheController {

    @GetMapping
    public Iterable<Kompetenzbereich> getTasks() {
        return Arrays.asList(Kompetenzbereich.values());
    }
}
