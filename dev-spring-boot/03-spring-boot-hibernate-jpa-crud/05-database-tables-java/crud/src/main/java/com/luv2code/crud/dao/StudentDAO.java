package com.luv2code.crud.dao;

import java.util.List;


import com.luv2code.crud.entity.Student;

//			     Data Access Object (DAO)    <->   DATABASE     /// genel işlem tanimlari  belirtiliyor
public interface StudentDAO {
	
	void save(Student st);
	
	Student findbyID(Integer studentid);
	
	List<Student> getallOBJs(); 	//döndürecegi değer Öğrenci listesi
	
	List<Student> findbyLastname(String lastnameparam);
	
	void update(Student studentFORupdating);
	
	void deleteStudentbyID(Integer id);
	
	int deleteALLstudents();
}
