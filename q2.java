//Kareena 19105112    
/*Write a program that would print the information (name, year of joining, salary,
address) of three employees by creating a class named &#39;Employee&#39;. The output should
be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreet
Sam                2000                68D- WallsStreet
John                1999                26B- WallsStreet */

class Employee{
    
    //class members
    String name;
    int year;
    String address;
    
    //parameter constructor
    Employee(String name, int year, String address){

        this.name = name;
        this.year = year;
        this.address = address;

    }
}

class q2 {
public static void main(String args[]){

    //creating objects 
    Employee emp_1 = new Employee("Robert", 1994, "64C- WallsStreet");
    Employee emp_2 = new Employee("Sam", 2000, "68D- WallsStreet");
    Employee emp_3 = new Employee("John", 1999, "26B- WallsStreet");
    
    //printing
    System.out.println("Name    Year of joining     Address");
    System.out.println(emp_1.name + "   " + emp_1.year + "           " + emp_1.address);
    System.out.println(emp_2.name + "      " + emp_2.year + "           " + emp_2.address);
    System.out.println(emp_3.name + "     " + emp_3.year + "           " + emp_3.address);

}
    
}
