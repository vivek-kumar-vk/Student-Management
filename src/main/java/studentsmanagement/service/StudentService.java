package studentsmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentsmanagement.entity.Student;
import studentsmanagement.repository.StudentReposotiory;

@Service
public class StudentService {
	
	@Autowired
	private StudentReposotiory reposotiory;
	
	public void addStudent(Student student) {
		reposotiory.addStudent(student);
	}
	
}
