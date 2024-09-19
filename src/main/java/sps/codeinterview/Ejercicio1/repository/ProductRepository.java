package sps.codeinterview.reto1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sps.codeinterview.reto1.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
