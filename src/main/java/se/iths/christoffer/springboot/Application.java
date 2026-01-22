package se.iths.christoffer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //Spring startar upp applikationskontexten
        SpringApplication.run(Application.class, args);
    }

}
