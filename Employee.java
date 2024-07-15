/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_system;

/**
 *
 * @author User
 */
public class Employee {
    // Employees managed using an ArrayList
    String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}