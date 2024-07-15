/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_system;

/**
 *
 * @author User
 */
public class Customer {
    // Customers managed using a linked list
    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
