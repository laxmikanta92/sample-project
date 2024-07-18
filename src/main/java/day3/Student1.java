package day3;

public class Student1 
{
	String firstname;
	String lastname;
	int studentId;
	String mailId;
	String[] courses;
	
	public Student1(String fname, String lname,int id,String mail,String[] course) 
	{
		firstname=fname;
		lastname=lname;
		studentId=id;
		courses=course;
		mailId=mail;
	}
	void display() 
	{
		System.out.println("student first name:"+ firstname);
		System.out.println("last name :"+lastname);
		System.out.println("Student id :"+ studentId);
		System.out.println("email :"+ mailId);
		
		for(int i=0;i<courses.length;i++)
		{
          System.out.println("couse :"+ courses[i]);
		}
		System.out.println("-----------------------------");
	}

	void display(int searchId) 
	{
		System.out.println("student first name:"+ firstname);
		System.out.println("last name :"+lastname);
		System.out.println("Student id :"+ studentId);
		System.out.println("email :"+ mailId);
		
		for(int i=0;i<courses.length;i++)
		{
          System.out.println("course :"+ courses[i]);
		}
		System.out.println("-----------------------------");
	}
	
}
