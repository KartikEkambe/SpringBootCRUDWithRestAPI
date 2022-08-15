package SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.service;

import javax.transaction.Transactional;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.model.Student;
import SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentRepository repository;
	
	public List<Student>GetAllStudents(){
		return repository.findAll();
	}
	
	public Student GetStudentById(Integer id) {
		return repository.findById(id).get();
	}
	
	public void SaveStudent(Student std) {
		repository.save(std);
	}
	
	public void DeleteStudent(Integer id) {
		repository.deleteById(id);
	}
	
}
