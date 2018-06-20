package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import model.StudentEntity;
import services.StudentManager;

@Controller
public class StudentController {
	@Autowired
	StudentManager manager;
	public StudentEntity getStudentDetails()
	
	{
	return manager.getStudentDetails();	
		
	}

}
