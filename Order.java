
package cafeteria_system;

import java.util.List;

/**
 *
 * @author User
 */
public class Order {
    // Orders managed using a queue
    String customerName;
    List<String> items;

    Order(String customerName, List<String> items) {
        this.customerName = customerName;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order for " + customerName + ": " + items;
    }
}
