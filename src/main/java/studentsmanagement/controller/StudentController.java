package studentsmanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import studentsmanagement.entity.Student;
import studentsmanagement.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/getstudent")
	public void addStudent(HttpServletRequest req , HttpServletResponse res) {
		
		 int studentId = Integer.parseInt(req.getParameter("studentId"));
		 String studentName = req.getParameter("studentName"); 
		 long StudentNumber = Long.parseLong(req.getParameter("studentNumber"));
		 String studentCountry = req.getParameter("studentCountry");
		 
		 Student student = new Student();
		 student.setStudentId(studentId);
		 student.setStudentName(studentName);
		 student.setStudentNumber(StudentNumber);
		 student.setStudentCountry(studentCountry);
		 
		studentService.addStudent(student);
	}
}
