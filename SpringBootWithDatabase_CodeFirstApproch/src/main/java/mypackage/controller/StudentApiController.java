package mypackage.controller;

import mypackage.service.*;
import mypackage.model.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentApiController {

	
	@Autowired
	StudentService studservice;
	
	@PostMapping("api/student")
	public Student Add(@RequestBody Student st) {
		return studservice.AddStudent(st);
	}
	
	@PutMapping("api/student")
	public Student Update(@RequestBody Student st) {
		return studservice.UpdateStudent(st);
	}
	
	@DeleteMapping("api/student/{id}")
		public Student Delete(@PathVariable("id") int id) {
			return studservice.DeleteStudent(id);
		}
	@GetMapping("api/student")
	public List<Student> GetAll(){
		return studservice.GetStudents();
	}
	
	@GetMapping("api/student/{id}")
	public Student GetById(@PathVariable("id") int rno) {
		return studservice.GetStudent(rno);
	}
	
}
