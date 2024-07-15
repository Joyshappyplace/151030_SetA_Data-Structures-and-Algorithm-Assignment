/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria_system;

import java.awt.MenuItem;
import java.util.TreeSet;

public class Menu {
    // Binary Search Tree for Menu Items
    private TreeSet<MenuItem> items;

    Menu() {
        items = new TreeSet<>();
    }

    void addItem(String item) {
        System.out.println(item);
        //var add = items.add(item);
    }

    void printMenu() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }
}

