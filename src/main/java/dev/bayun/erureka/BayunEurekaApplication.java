package dev.bayun.erureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BayunEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BayunEurekaApplication.class, args);
    }

}
