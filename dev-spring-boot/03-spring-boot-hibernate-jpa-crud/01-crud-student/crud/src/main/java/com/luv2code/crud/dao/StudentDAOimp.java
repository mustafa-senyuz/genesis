package com.luv2code.crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.crud.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


// DAO ->  veri erişim katmanıyla ilgili görevler
/* 
			    	  			Data Access Object (DAO)
 
								 1 - repo (depolama)
								 2 - entity
								 3 - transaction [ persist ]
*/


@Repository
public class StudentDAOimp implements StudentDAO{
	
	//fields for entity manager
	private EntityManager em;

	//const. injection
	@Autowired
	public StudentDAOimp(EntityManager any_entity) {
 
		this.em = any_entity;
	}

	@Override
	@Transactional											// geri sarılabilir işlem yapılacak
	public void save(Student newstudent) {
 
			em.persist(newstudent);
		
	}
}