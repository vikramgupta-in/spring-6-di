package guru.springframework.spring6di.controllers.faux;

import guru.springframework.spring6di.services.faux.FauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final FauxService fauxService;

    public FauxController(@Qualifier("faux") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getSource(){
        return fauxService.dataSource();
    }
}
