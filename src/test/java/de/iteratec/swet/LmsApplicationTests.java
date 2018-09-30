package de.iteratec.swet;

import de.iteratec.swet.mitarbeiter.Mitarbeiter;
import de.iteratec.swet.mitarbeiter.MitarbeiterRepository;
import de.iteratec.swet.mitarbeiter.MitarbeiterService;
import de.iteratec.swet.mitarbeiter.MitarbeiterServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class LmsApplicationTests {

    @TestConfiguration
    static class MitarbeiterServiceImplTestContextConfiguration {

        @Bean
        public MitarbeiterService mitarbeiterService() {
            return new MitarbeiterServiceImpl();
        }
    }

    @Autowired
    private MitarbeiterService mitarbeiterService;

    private MitarbeiterRepository mitarbeiterRepository;

    @Test
    public void createMitarbeiterTest() {
        Mitarbeiter mitarbeiter = new Mitarbeiter("Yaiza", "Gonzalo Alt");
        Mitarbeiter createdMitarbeiter = mitarbeiterService.createMitarbeiter("ygo", mitarbeiter);
        assertEquals("ygo", createdMitarbeiter.getKuerzel());
    }

//    @Test
//    public void updateMitarbeiterTest() {
//        Mitarbeiter mitarbeiter = new Mitarbeiter("Yaiza", "González");
//        Mitarbeiter createdMitarbeiter = mitarbeiterService.updateMitarbeiter("ygo", mitarbeiter);
//        assertEquals("ygo", createdMitarbeiter.getKuerzel());
//        assertEquals("González", createdMitarbeiter.getNachname());
//    }

}
