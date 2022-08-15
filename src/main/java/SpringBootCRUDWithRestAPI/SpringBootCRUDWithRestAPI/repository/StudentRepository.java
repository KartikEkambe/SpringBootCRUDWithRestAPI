package SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
