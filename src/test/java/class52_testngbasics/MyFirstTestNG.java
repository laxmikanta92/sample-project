package class52_testngbasics;

import org.testng.annotations.Test;

public class MyFirstTestNG 
{
@Test(priority = 1)	
public void test1() 
{
	System.out.println("test1 excecuted");
}
@Test(priority = 2)
public void addtocart()
{
	System.out.println("add to cart executed");
}
}

