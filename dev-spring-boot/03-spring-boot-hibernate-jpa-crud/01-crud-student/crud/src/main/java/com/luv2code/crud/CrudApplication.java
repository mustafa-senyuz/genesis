package com.luv2code.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.crud.dao.StudentDAO;
import com.luv2code.crud.dao.StudentDAOimp;
import com.luv2code.crud.entity.Student;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner Cmdlinerunner(StudentDAO stDAO) {													// String[] args
		return runner -> {
			
 				createStudent(stDAO);																			//System.out.println("ILK CALisacak UYGULAMADIR .... ");
		
		};
	}

	private void createStudent(StudentDAO newDAO) {					//inf. üzerinden türeyen sinifla obj oluştur
 		 
		System.out.println("Building a new temp student ...");
		Student tempstudent = new Student( "faruk" ,  "özcan",  "attimtuttumbenseniyendim@gmail.com");
		Student tempstudent2 = new Student( "ahmet" ,  "kara",  "attimtuttumbenseniyendim@gmail.com");
		Student tempstudent3 = new Student( "sinan" ,  "lavuk",  "attimtuttumbenseniyendim@gmail.com");
		
		
		System.out.println("SAVING THE THE STUDENT ...");
		newDAO.save(tempstudent);									// inf. metodu ile işlem yapıyor
		newDAO.save(tempstudent2);	
		newDAO.save(tempstudent3);	
		
		System.out.println("saved student id is : " + tempstudent.getId());
 		
	}
		
	
	

}
