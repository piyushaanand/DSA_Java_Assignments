import java.util.Scanner;
class Person{
    String name ;
    int age;

    Person(String name , int age){
        this.name = name ;
        this.age = age ;
    }
}
class Employee extends Person{
    int Eid;
    double Salary;

    Employee(String name,int age , int Eid, double Salary){
        super(name,age);
        this.Eid = Eid;
        this.Salary = Salary;
    }
    void empDisplay(){
        System.out.println(name+"-"+age+"-"+Eid+"-"+Salary);
    }
}
public class A2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details of Employee : ");
        String n = sc.nextLine();
        int a = sc.nextInt();
        int E = sc.nextInt();
        double S = sc.nextDouble();
        Employee obj = new Employee(n, a, E, S);
        obj.empDisplay();

    }
    
}
