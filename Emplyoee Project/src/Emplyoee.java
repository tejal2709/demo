
public class Emplyoee 
{
private int id;
private String name;
public String department;

public void setId(int id)
{
	this.id=id;
}
public void setName(String name)
{
	this.name=name;
}
public void setDepartment(String department)
{
	this.department=department;
}
public int getid() 
{
return id;
}
public String getname()
{
	return name;
	
}
public String getdepartment()
{
	return department;
}
public static void main(String[] args) {
	Emplyoee e=new Emplyoee();
	e.setId(34);
	e.setName("Tejal Bhoi");
	e.setDepartment("Support Engineer");
}
}
