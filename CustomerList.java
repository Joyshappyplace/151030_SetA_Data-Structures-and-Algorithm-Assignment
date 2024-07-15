/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_system;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class CustomerList {
    private LinkedList<Customer> customers;

    CustomerList() {
        customers = new LinkedList<>();
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }

    void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}


