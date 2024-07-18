package day3;

import java.util.Scanner;

public class StudentDriver 
{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number of students");
    int numOfStudents=sc.nextInt();
	Student1[] student=new Student1[numOfStudents];
	for(int j=0;j<numOfStudents;j++) 
	{
	System.out.println("enter the details of the student "+(j+1)+":");	
    System.out.println("enter first name");
	String fname=sc.next();
	System.out.println("enter last name");
	String lname=sc.next();
	System.out.println("enter Student id");
	int id=sc.nextInt();
	System.out.println("enter email id");
	String mail=sc.next();
	System.out.println("number of courses");
	int numberOfCourses=sc.nextInt();
	String[] course_name=new String[numberOfCourses];
	
	for(int i=0;i<numberOfCourses;i++) 
	{
	  System.out.println("course"+(i+1)+":");
	  course_name[i]=sc.next();  
	}
	 student[j]=new Student1(fname,lname,id,mail,course_name);
	 
	}
	System.out.println("displaying all student details");
	for(int i=0;i<numOfStudents;i++) 
	{
		student[i].display();
	}
	
	System.out.println("enter the student id for details");
	int searchId=sc.nextInt();
	boolean found=false;
	for(int i=0;i<numOfStudents;i++) 
	{
	if(searchId==student[i].studentId) 
	{
		student[i].display(searchId);
		found=true;
		break;
	}
	}
	 if (!found) 
	 {
         System.out.println("student id not found");
     }

}
}
