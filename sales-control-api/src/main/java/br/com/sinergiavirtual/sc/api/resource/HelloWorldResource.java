package br.com.sinergiavirtual.sc.api.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldResource.class);

    //@RequestMapping("/")
    public String sayHello() {
        LOGGER.info("M=sayHello");
        return "Hello World";
    }
}