/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APR_assignment;

/**
 *
 * @author aungsettpaing
 */
public class Encapsulation {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setName("Aung");
        employee1.setAge(30);
        employee1.setSalary(50000.0);
        System.out.println("Employee 1 Name: " + employee1.getName());
        System.out.println("Employee 1 Age: " + employee1.getAge());
        System.out.println("Employee 1 Salary: " + employee1.getSalary());
        
        employee2.setName("Will Smith");
        employee2.setAge(25);
        employee2.setSalary(60000.0);

        System.out.println("Employee 1 Name: " + employee1.getName());
        System.out.println("Employee 1 Age: " + employee1.getAge());
        System.out.println("Employee 1 Salary: " + employee1.getSalary());

        System.out.println("Employee 2 Name: " + employee2.getName());
        System.out.println("Employee 2 Age: " + employee2.getAge());
        System.out.println("Employee 2 Salary: " + employee2.getSalary());
    }
}
