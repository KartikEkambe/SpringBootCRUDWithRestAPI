package SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.model.Student;
import SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.service.StudentService;

@RestController
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowedHeaders = {"*"})
public class StudentController {
	@Autowired
	StudentService ss;
	
	@GetMapping("/Select")
	public List<Student> GetAllStudent(){
		return ss.GetAllStudents();
	}
	
	@GetMapping("/Select/{id}")
	public Student GetStudentById(@PathVariable("id") int id) {
		return ss.GetStudentById(id);
	}
	
	@PostMapping("/Insert")
	public String AddStudent(@RequestBody Student s) {
		ss.SaveStudent(s);
		return "Student Added/Inserted Successfully";
	}
	
	@PostMapping("/Update")
	public String UpdateStudent(@RequestBody Student s) {
		ss.SaveStudent(s);
		return "Student Updated Successfully";
	}
	
//	@PutMapping("/Update")
//	public String UpdateStudent(@RequestBody Student s) {
//		ss.SaveStudent(s);
//		return "Student Updated Successfully";
//	}
	
	
	@DeleteMapping("/Delete/{id}")
	public String UpdateStudent(@PathVariable("id")int id) {
		ss.DeleteStudent(id);
		return "Student Deleted Successfully";
	}
	
}
