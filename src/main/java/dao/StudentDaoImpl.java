package dao;

import org.springframework.stereotype.Repository;

import model.StudentEntity;
@Repository
public class StudentDaoImpl implements StudentDao{
	public StudentEntity getStudentDetails()
	{
		StudentEntity entity=new StudentEntity();
		entity.setId(1);
		entity.setName("ram kumar");
		entity.setAddress("hyd");
		return entity;
		
		
	}

}
