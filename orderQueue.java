
package cafeteria_system;

import java.util.LinkedList;
import java.util.Queue;


public class orderQueue {
    private Queue<Order> orders;

    orderQueue() {
        orders = new LinkedList<>();
    }

    void placeOrder(Order order) {
        orders.add(order);
    }

    Order serveOrder() {
        return orders.poll();
    }

    boolean hasOrders() {
        return !orders.isEmpty();
    }
}

