package studentsmanagement.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import studentsmanagement.entity.Student;

@Repository
public class StudentRepositoryimpl implements StudentReposotiory {

	public Session getSession() {
		Configuration configuration  = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		return session;
	}

	@Override
	public void addStudent(Student student) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
	
		
		session.save(student);
		
		transaction.commit();
		session.close();
		
		
	}
	
}
