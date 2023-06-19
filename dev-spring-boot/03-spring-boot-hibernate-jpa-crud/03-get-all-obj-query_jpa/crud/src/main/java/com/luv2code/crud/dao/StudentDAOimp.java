package com.luv2code.crud.dao;

import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.crud.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


// DAO ->  veri erişim katmanıyla ilgili görevler
/* 
			    	  			Data Access Object (DAO)
 
								* 1 - repo (depolama, değiştirme, silme işlemleri)
								  2 - entity
								* 3 - transaction [ persist ]
*/

//DAO old. göstergesi
@Repository
public class StudentDAOimp implements StudentDAO{
	
	
	
	
	//fields for entity manager
	private EntityManager em;
	
	
	

	//const. injection		--  ASIL AMAÇ EntityManager i kullanmak
	@Autowired
	public StudentDAOimp(EntityManager any_entity) {
 
		this.em = any_entity;
	}

	@Override
	@Transactional											// geri sarılabilir işlem yapılacak
	public void save(Student newstudent) {
 
			em.persist(newstudent);
		
	}

	@Override
	public Student findbyID(Integer studentid) {
			
		return em.find(Student.class , studentid);
		
		
	}

	@Override
	public List<Student> getallOBJs() {		//TABLO ismi
 
		String jpqlString = "From Student order by lastname";
		TypedQuery<Student> query = em.createQuery(jpqlString, Student.class);
		return query.getResultList();		// min. 3 yerde jpql - queryobj - method çagr.
		
		
		 
	}

	@Override
	public List<Student> findbyLastname(String lastnameparam) {
		 
		TypedQuery<Student> query = em.createQuery("From Student WHERE lastname=:placeholderstr", Student.class);
		
	    query.setParameter("placeholderstr", lastnameparam);		//hard coding olmaması için 
		
	    return query.getResultList();
	}
}