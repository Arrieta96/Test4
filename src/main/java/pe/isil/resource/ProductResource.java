package pe.isil.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.isil.model.Product;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class ProductResource {


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAll(){

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Arroz Faraon 5kg", 15.00, 10));

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

}
