import java.util.*;
class Employee{
  private String name, address;
  private int year, salary;
  public Employee(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }
}

public class Emp{
  public static void main(String[] args){
    Employee e1 = new Employee("Sandip Mahato", 2000, 900000, "Sector-V kolkata");
    Employee e2 = new Employee("Sammer Singh", 2000, 740000, "South Delhi");
    Employee e3 = new Employee("Daniel Joseph", 2001, 600000, "Kerala");
    System.out.println("Name\t\t\tYear of joining\t\tSalary\tAddress");
    System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());  
    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());
    System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());  
  }
}
