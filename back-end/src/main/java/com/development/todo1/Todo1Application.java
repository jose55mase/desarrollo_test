package com.development.todo1;

import com.development.todo1.entity.ProductEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class Todo1Application {
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		SpringApplication.run(Todo1Application.class, args);


		emf = Persistence.createEntityManagerFactory("aplicacion");
		manager = emf.createEntityManager();

		//ProductEntity product1 = new ProductEntity(23423,"ROPA", true);

		//ProductEntity product2 = new ProductEntity("GSGSD44549","TASAS", true);
		//manager.getTransaction().begin();
		//manager.persist(product1);



	}


}
