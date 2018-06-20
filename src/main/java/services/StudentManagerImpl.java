package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import model.StudentEntity;
@Service
public class StudentManagerImpl implements StudentManager {
	@Autowired
	StudentDao dao;
	public StudentEntity getStudentDetails()
	{
		
	return dao.getStudentDetails();
		
	}
	

}
