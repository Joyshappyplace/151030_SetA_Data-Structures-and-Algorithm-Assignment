
package cafeteria_system;

import java.util.Stack;

public class Inventory {
    // Inventory managed using a stack
    private Stack<String> items;

    Inventory() {
        items = new Stack<>();
    }

    void addItem(String item) {
        items.push(item);
    }

    String useItem() {
        if (!items.isEmpty()) {
            return items.pop();
        }
        return "No items available";
    }
}

