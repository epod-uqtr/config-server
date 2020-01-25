package ca.uqtr.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
@Controller
public class ConfigServerApplication {

    @Value("${test}")
    private String hello;

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

    @GetMapping("/")
    public String get() {
        return hello;
    }

    @GetMapping("/g")
    public String gg() {
        return "ggggg";
    }

}
