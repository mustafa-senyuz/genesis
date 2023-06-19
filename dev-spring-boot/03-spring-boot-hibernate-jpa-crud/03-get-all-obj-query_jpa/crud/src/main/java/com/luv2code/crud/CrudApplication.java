package com.luv2code.crud;

import java.util.Iterator;
import java.util.List;

import org.hibernate.type.AnyType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.crud.dao.StudentDAO;
import com.luv2code.crud.dao.StudentDAOimp;
import com.luv2code.crud.entity.Student;

import jakarta.persistence.EntityManager;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	@Bean						//MAIN RUNNER BEAN
	public CommandLineRunner Cmdlinerunner(StudentDAO stDAO) {													// String[] args
		return runner -> {
			
/*
			  
			   retrieve(stDAO); // ekstra cagirmadan calisacak alan
			
*/		
			
//			   fullList(stDAO) ;
			
			   getBYlastname(stDAO);
 
		};
	}

	private void getBYlastname(StudentDAO stDAO) {
		
		List<Student>  studentlist = stDAO.findbyLastname("senyuz");
		
		for (Student tempstdnt : studentlist) {
			System.out.println(tempstdnt);
		}	
	}

	
	
	
	private void fullList(StudentDAO sdao) {
		 
		List<Student> allStudents = sdao.getallOBJs();
		
		for (Student student : allStudents) {
			System.out.println(student);
		}
			
	}

/*
 	private void retrieve(StudentDAO stDAO) {
  
 		Student wanted_Student = stDAO.findbyID(2);
 		
 		System.out.println(wanted_Student);		//	toString() sonucu
 		
	}  
*/ 

}
