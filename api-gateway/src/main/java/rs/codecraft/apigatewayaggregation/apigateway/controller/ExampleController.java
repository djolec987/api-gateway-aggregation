package rs.codecraft.apigatewayaggregation.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

}
