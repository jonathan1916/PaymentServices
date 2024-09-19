package sps.codeinterview.reto2.controller;

mport sps.codeinterview.reto1.model.Product;
import sps.codeinterview.reto1.repository.ProductRepository;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/api/v1/cusrumer")
@Validated

//basepath: /api
public class PostsController{

    @GetMapping("/{id1}")
    public String getProductById(@PathVariable Integer id1){
        return String.format("Parametros Recibidos: id1 %s:", id1)
    }
	
}