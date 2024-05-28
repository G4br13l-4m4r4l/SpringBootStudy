package dio.spring_security_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        System.out.println("Usuario acessou!");
        return "Welcome to Spring Security API";
    }
}
