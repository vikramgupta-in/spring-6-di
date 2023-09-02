package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("faux")
public class FauxServiceUat implements FauxService{
    @Override
    public String dataSource() {
            return "UAT Datasource";
    }
}
