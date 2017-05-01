package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@SpringBootApplication
@EnableScheduling
public class NotiServiceApplication {

    public static void main(String ... args) {
        SpringApplication.run(NotiServiceApplication.class, args);
    }

}
