package cafeteria_system;

import java.awt.MenuItem;
import java.util.Arrays;
import java.util.List;

public class CafeteriaManagementSystem {
    public static void main(String[] args) {
        // Initialize Menu
        Menu menu = new Menu();
        menu.addItem("Burger @ 5.99");
        menu.addItem("Fries @ 2.99");
        menu.addItem("Soda @ 1.99");
        menu.addItem("Samosa @ 3.99");
        

        // Initialize Inventory
        Inventory inventory = new Inventory();
        inventory.addItem("Burger Bun");
        inventory.addItem("Patty");
        inventory.addItem("Lettuce");
        inventory.addItem("Tomato");
        inventory.addItem("Potatoes");

        // Initialize Order Queue
        orderQueue orderQueue = new orderQueue(); // Corrected class name

        // Initialize Customer List
        CustomerList customerList = new CustomerList();
        customerList.addCustomer(new Customer("Alice"));
        customerList.addCustomer(new Customer("Bob"));
        

        // Initialize Employee List
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(new Employee("John"));
        employeeList.addEmployee(new Employee("Jane"));

        // Display Menu
        System.out.println("Menu:");
        menu.printMenu();

        // Display Inventory
        System.out.println("\nUsing Inventory Items:");
        System.out.println(inventory.useItem());
        System.out.println(inventory.useItem());
        System.out.println(inventory.useItem());
        System.out.println(inventory.useItem());
        

        // Place and Serve Orders
        List<String> items1 = Arrays.asList("Burger", "Fries");
        List<String> items2 = Arrays.asList("Soda", "Fries");
        orderQueue.placeOrder(new Order("Alice", items1));
        orderQueue.placeOrder(new Order("Bob", items2));

        System.out.println("\nOrders:");
        while (orderQueue.hasOrders()) {
            System.out.println(orderQueue.serveOrder());
        }

        // Display Customers
        System.out.println("\nCustomers:");
        customerList.printCustomers();

        // Display Employees
        System.out.println("\nEmployees:");
        employeeList.printEmployees();
    }
}