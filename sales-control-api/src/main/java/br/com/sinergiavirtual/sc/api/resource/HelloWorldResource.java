package br.com.sinergiavirtual.sc.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}