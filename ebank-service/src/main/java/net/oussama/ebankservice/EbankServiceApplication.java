package net.oussama.ebankservice;

import net.oussama.ebankservice.service.EbankService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EbankServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbankServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(EbankService ebankService){
        retrurn args ->{

        }
    }

}
