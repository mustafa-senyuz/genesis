package com.luv2code.crud;

import java.util.Iterator;
import java.util.List;

import org.hibernate.event.spi.DeleteEvent;
import org.hibernate.type.AnyType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.crud.dao.StudentDAO;
import com.luv2code.crud.dao.StudentDAOimp;
import com.luv2code.crud.entity.Student;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EntityManager;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	@Bean	 //MAIN RUNNER BEAN   sadece fonk. cagrilarini SERVICE üzerinden getiriyor  SERVICE OBJ. = DAO imp. obj
	public CommandLineRunner Cmdlinerunner(StudentDAO stDAO) {		 // String[] args
		return runner -> {
			
				
				addmultipleStudent(stDAO);
			
/*			  
			   retrieve(stDAO); // ekstra cagirmadan calisacak alan			
*/		
			
//			   fullList(stDAO) ;
			
//			   getBYlastname(stDAO);
			
/*			   updateAstudent(stDAO);	*/	
			   
//			   deleteStudentbyID(stDAO);
			
//			   deleteAllelements(stDAO);
				
		};
	}

	private void addmultipleStudent(StudentDAO stDAO) {
		
		Student s1= new Student("ali" , "ata" , "adimla@gmail.com");
		Student s2= new Student("bekir" , "baka" , "bakimla@gmail.com");
		Student s3= new Student("cemsit" , "cana" , "canimla@gmail.com");
		
		stDAO.save(s1);
		stDAO.save(s2);
		stDAO.save(s3);
		
		System.out.println("3 new objects added to database ... ");
		
	}

	private int deleteAllelements(StudentDAO stDAO) {
 
		System.out.println("deleting all table ... ");
		int lost_rawnumbers = stDAO.deleteALLstudents();
		
		System.out.println("total deleted items : " + lost_rawnumbers );
		
		return lost_rawnumbers;
	}

	
	
	private void deleteStudentbyID(StudentDAO stDAO) {
		 
		System.out.println("3010 id li ögrenci çagrılsın");
		Student std3010 = stDAO.findbyID(3010);
		System.out.println(std3010);
		
		System.out.println("3010 id li ögrenci siliniyor ... ");
		stDAO.deleteStudentbyID(3010);
		
		
		Student is3010Studentthere = stDAO.findbyID(3010);
		if (is3010Studentthere==null) System.out.println("3010 is no more exist");  
			
	}

	private void updateAstudent(StudentDAO stDAO) {		//hard coding
		
		//get student by id
		System.out.print ("getting the student by id 3000");
		Student chosenStudent = stDAO.findbyID(3000);
		System.out.println(chosenStudent);
		
		//change its name 
		System.out.println("by 3000 student firstname is changed to felix");
		chosenStudent.setFirstname("felix");
		
		//update
		System.out.println("update process is completed");
		stDAO.update(chosenStudent);
		
		//check
		Student updated_student = stDAO.findbyID(3003);
		System.out.println(updated_student);
		
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

 
 	private void retrieve(StudentDAO stDAO) {
  
 		Student wanted_Student = stDAO.findbyID(2);
 		
 		System.out.println(wanted_Student);		//	toString() sonucu
 		
	}  
 

}
