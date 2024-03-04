package studentsmanagement.repository;

import org.hibernate.Session;
import studentsmanagement.entity.Student;


public interface StudentReposotiory {

	public Session getSession();
	public void addStudent(Student student);
}
