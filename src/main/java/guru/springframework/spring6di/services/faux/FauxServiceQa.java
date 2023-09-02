package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("faux")
public class FauxServiceQa implements FauxService{
    @Override
    public String dataSource() {
        return "QA Datasource";
    }
}
