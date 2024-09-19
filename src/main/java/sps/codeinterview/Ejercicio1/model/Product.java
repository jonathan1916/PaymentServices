package sps.codeinterview.reto1.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String label;

	private Double price;

	@CreationTimestamp
	private Date createdAt;

	public Product() {
		name = "";
		label = "";
		price = 0.0;
	}

}
