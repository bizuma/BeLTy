package belty.share.dataregister;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("belty.share.repository")
@EntityScan("belty.share.entity")
@SpringBootApplication
public class EntityTestConfiguration {

}
