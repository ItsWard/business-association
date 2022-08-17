package run.ward.businessassociation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BusinessAssociationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessAssociationApplication.class, args);
    }

}
