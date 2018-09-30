package de.iteratec.swet.kompetenzstufen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(value = "api/kompetenzstufen")
public class KompetenzstufenController {

    @GetMapping
    public Iterable<Kompetenzstufe> getTasks() {
        return Arrays.asList(Kompetenzstufe.values());
    }
}
