package de.iteratec.swet.laufbahnstufen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/laufbahnstufen")
public class LaufbahnstufenController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LaufbahnstufenController.class);

    @Autowired
    private LaufbahnstufenService laufbahnstufenService;

    @GetMapping
    public List<Laufbahnstufe> getAllLaufbahnstufen() {
        return laufbahnstufenService.getAll();
    }

    @PostMapping
    public Laufbahnstufe createLaufbahnstufe(@RequestBody Laufbahnstufe laufbahnstufe) {
        LOGGER.info("got Laufbahnstufe: {}", laufbahnstufe);
        return laufbahnstufenService.createLaufbahnstufe(laufbahnstufe);
    }
}
