package sps.codeinterview.reto1.controller;

import sps.codeinterview.reto1.model.Product;
import sps.codeinterview.reto1.repository.ProductRepository;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/crud")
@Validated
public class ProductController {
	
	//Add the correct notations
	private ProductRepository productRepository;


	//Add notation GET: /products
	public List<Product> getProducts() {

		return null;
	}


	//Add notation GET: /product/{id}
	public Product getProductById(@PathVariable Long id){
		return null;
	}

	//Add notation POST: /product
	public Product createProduct(@RequestBody Product product) {
		System.out.println(product.toString());

		product = productRepository.save(product);

		return product;
	}

	//Add notation PUT: product/{id}
	public ResponseEntity<String> updateProduct(@PathVariable Long id, @RequestBody Product product) {
		return null;
	}

	//Add notation DELETE: product/{id}
	public String deleteProduct(@PathVariable Long id) {
		return null;
	}
}