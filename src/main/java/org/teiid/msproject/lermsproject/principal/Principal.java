package org.teiid.msproject.lermsproject.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.teiid.msproject.lermsproject.servico.LerMsProject;



@EntityScan("org.teiid.msproject.lermsproject.domain")
@EnableJpaRepositories("org.teiid.msproject.lermsproject.repositiry")
@SpringBootApplication(scanBasePackages = "org.teiid.msproject.*")
public class Principal implements CommandLineRunner {


    @Autowired
    LerMsProject lerMsProject;

    public static void main(String[] args)   {

        SpringApplication.run(Principal.class, args);

    }


    public void run(String... args) throws Exception {
        lerMsProject.leraquivo();
    }

}
