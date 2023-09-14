import java.util.*;
import java.util.Scanner;

public class Infosys 
{
public static void main(String[] args) {
	Emplyoee e=new Emplyoee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id of Emplyoee");
	e.setId(sc.nextInt());
	System.out.println("Enter Name of Emplyoee");
	e.setName(sc.next());
	System.out.println("Enter Department of Emplyoee");
	e.setDepartment(sc.next());
	List<Emplyoee> e1=new ArrayList();
	e1.add(e);
	Iterator<Emplyoee>itr=e1.iterator();
	while(itr.hasNext())
		{
		Emplyoee emp= itr.next();
		System.out.println(emp.getid());
		System.out.println(emp.getname());
		System.out.println(emp.getdepartment());
		}
}
}
