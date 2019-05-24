package com.sathya.ecom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface School
{
	void info();
}
class Principal implements School
{
public void info()
{
	System.out.println("only some are present");
}
}
class Teacher implements School
{
	 
	public void info()
   {
		
		System.out.println(" all students are present");
	}
}
class Display
{
	School school;
	public void setAbc(School school)
	{
		this.school=school;
	}
}
public class Student {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("Student.xml");
	Display disp=(Display)context.getBean("disp");
	disp.school.info();
	

	}

}
