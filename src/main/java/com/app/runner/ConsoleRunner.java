package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		/*List<Product> list=repo.findAll();
		list.forEach(System.out::println);*/
		
		//findAll(Sort) 
		/*repo.findAll(Sort.by("prodCode"))
		.forEach(System.out::println);*/
				
		//findAll(Pageable)
		/*PageRequest p=PageRequest.of(1, 3);
		repo.findAll(p)
		.forEach(System.out::println);*/
		
		//findAll(Example)
		//#1.
		/*Product p=new Product();
		p.setProdCost(2.1);
		Example<Product> ex = Example.of(p);
		repo.findAll(ex).forEach(System.out::println);*/
		
		//#2.
		/*Product p = new Product();
		p.setProdCost(3.1);
		Example<Product> ex = Example.of(p);
		repo.findAll(ex, Sort.by(Direction.DESC, "prodCode"))
		.forEach(System.out::println);*/
		
		//#3.
		/*Product p = new Product();
		p.setProdCost(3.1);
		Example<Product> ex = Example.of(p);
		repo.findAll(ex, PageRequest.of(1, 1))
		.forEach(System.out::println);*/
		
		//findAllById
		
		repo.findAllById(Arrays.asList(2,5,8,10))
		.forEach(System.out::println);
		
	}

}
