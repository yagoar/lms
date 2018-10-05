package de.iteratec.swet.kompetenzen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(value = "api/kompetenzstufen")
public class KompetenzstufenController {

    @GetMapping
    public Iterable<Kompetenzstufe> getKompetenzstufen() {
        return Arrays.asList(Kompetenzstufe.values());
    }
}
