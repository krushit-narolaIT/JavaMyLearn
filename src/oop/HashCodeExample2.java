package oop;

import java.util.Objects;

class Employee {
    int id;
    String name;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Objects.equals(name, employee.name);
//    }

    @Override
    public boolean equals(Object o) {
        Employee emp = (Employee)o;
        if (this.id == emp.id && this.name == emp.name) return true;;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


public class HashCodeExample2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "Krushit";

        Employee emp2 = new Employee();
        emp2.id = 1;
        emp2.name = "Krushit";

        System.out.println("Hashcode of emp1 :" + emp1.hashCode() + "\nHashcode of emp2 :" + emp2.hashCode());
        System.out.println("ex1 & ex2 are Equals? :: " + emp1.equals(emp2));

        System.out.println("================================================");

        Employee emp3 = new Employee();
        emp3.id = 1;
        emp3.name = "Krushit";

        Employee emp4 = new Employee();
        emp4.id = 2;
        emp4.name = "Sujal";

        System.out.println("Hashcode of emp3 :" + emp3.hashCode() + "\nHashcode of emp4 :" + emp4.hashCode());
        System.out.println("ex1 & ex2 are Equals? :: " + emp3.equals(emp4));

        System.out.println("================================================");




    }
}
