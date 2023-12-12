package mypackage.service;
import mypackage.repositery.*;
import mypackage.model.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class StudentService {
	
	@Autowired
	StudentRepositery studrepo;
	
	public Student AddStudent(Student st) {
		Student s = studrepo.save(st);
		return s;
	}
	

	public Student UpdateStudent(Student st) {
		Student s = studrepo.save(st);
		return s;
	}
	
	public List<Student> GetStudents(){
		return studrepo.findAll();
	}
	
	public Student GetStudent(int rno) {
		return studrepo.findById(rno).get();
	}
	
	public Student DeleteStudent(int rno) {
		Student st= GetStudent(rno);
		studrepo.delete(st);
		return st;
		
	}

}
