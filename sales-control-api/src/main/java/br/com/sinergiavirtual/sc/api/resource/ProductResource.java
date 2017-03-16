package br.com.sinergiavirtual.sc.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.com.sinergiavirtual.sc.core.ProductService;
import br.com.sinergiavirtual.sc.model.entity.Product;

@RestController
public class ProductResource {


    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = EndPointURL.URL_PRODUCTS)
    public ResponseEntity<List<Product>> listProductsToSell() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
