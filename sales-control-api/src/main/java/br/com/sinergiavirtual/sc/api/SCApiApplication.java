package br.com.sinergiavirtual.sc.api;

import br.com.sinergiavirtual.sc.SCCoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ SCCoreConfiguration.class })
public class SCApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SCApiApplication.class, args);
    }
}
