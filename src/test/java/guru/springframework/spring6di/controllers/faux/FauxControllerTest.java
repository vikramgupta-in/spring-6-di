package guru.springframework.spring6di.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"qa","EN"})
@SpringBootTest
class FauxControllerTest {

    @Autowired
    private FauxController fauxController;
    @Test
    void getSource() {
        System.out.println(fauxController.getSource());
    }

}