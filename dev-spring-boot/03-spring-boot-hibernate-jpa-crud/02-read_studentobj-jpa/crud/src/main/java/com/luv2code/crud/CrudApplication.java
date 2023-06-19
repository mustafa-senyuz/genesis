package com.luv2code.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.crud.dao.StudentDAO;
import com.luv2code.crud.dao.StudentDAOimp;
import com.luv2code.crud.entity.Student;

import jakarta.persistence.CacheRetrieveMode;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner Cmdlinerunner(StudentDAO stDAO) {													// String[] args
		return runner -> {
			
			retrieve(stDAO);	// ekstra cagirmadan calisacak alan
		
		};
	}

	private void retrieve(StudentDAO stDAO) {
 
		Student wanted_Student = stDAO.findbyID(1);
		
		System.out.println(wanted_Student);		//toString() sonucu
		
	}
	
 
	
	

}
