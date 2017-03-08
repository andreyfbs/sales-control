package br.com.sinergiavirtual.sc.api.resource;

import br.com.sinergiavirtual.sc.core.SellerService;
import br.com.sinergiavirtual.sc.model.entity.Seller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldResource.class);

    @Autowired
    SellerService sellerService;

    @RequestMapping("/")
    public String sayHello() {
        LOGGER.info("M=sayHello");
        List<Seller> list = sellerService.sellerList("Jack McFly");
        if (list != null) {
            LOGGER.info("Lista=" + list);
        }
        return "Hello World";
    }
}