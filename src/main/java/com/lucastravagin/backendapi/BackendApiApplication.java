package com.lucastravagin.backendapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucastravagin.backendapi.domain.Categoria;
import com.lucastravagin.backendapi.domain.Produto;
import com.lucastravagin.backendapi.repositories.CategoriaRepository;

@SpringBootApplication
public class BackendApiApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Instâncias das Categorias
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		//Instância dos produtos
		Produto p1 = new Produto(null, "Computador",2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse",80.00);
		
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
		
	}
	
}


