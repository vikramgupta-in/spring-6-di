package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("faux")
public class FauxServiceProd implements FauxService{
    @Override
    public String dataSource() {
        return "Prod DataSource";
    }
}
