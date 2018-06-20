package com.mpower.MavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import controller.StudentController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		StudentController sc=(StudentController)context.getBean("studentController");
		
		System.out.println(sc.getStudentDetails());
        
        
    }
}
