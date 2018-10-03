package de.iteratec.swet;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.iteratec.swet.mitarbeiter.Mitarbeiter;
import de.iteratec.swet.mitarbeiter.MitarbeiterController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MitarbeiterControllerIntegrationTest {


    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    private MitarbeiterController mitarbeiterController;

    @Test
    public void createMitarbeiterTest() throws Exception {
        Mitarbeiter ma = new Mitarbeiter();
        ma.setVorname("Yaiza");
        ma.setNachname("Gonzalo Alt");

        MvcResult mvcResult = mockMvc.perform(post("api/mitarbeiter/ygo", ma)).andReturn();

        Mitarbeiter parsedResponse = mapper.readValue(mvcResult.getResponse().getContentAsByteArray(), Mitarbeiter.class);

        assertEquals(ma.getKuerzel(), parsedResponse.getKuerzel());
        assertEquals(ma.getVorname(), parsedResponse.getVorname());
        assertEquals(ma.getNachname(), parsedResponse.getNachname());

    }
}
