package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    private int orderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        orderNumber = 1;
    }

    public void add(Order order) {
        order.setOrderNumber(orderNumber);
        orders.add(order);
        orderNumber++;
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order orderToDeliver = orders.get(0);
            System.out.println("Delivering order: " + orderToDeliver.getOrderNumber() + " | " + orderToDeliver.getName());
            orders.remove(0);
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        Order orderToDeliver = null;
        int index = -1;

        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderNumber() == orderNumber) {
                if (orderToDeliver == null || order.getOrderNumber() < orderToDeliver.getOrderNumber()) {
                    orderToDeliver = order;
                    index = i;
                }
            }
        }

        if (orderToDeliver != null) {
            System.out.println("Delivering order: " + orderToDeliver.getOrderNumber() + " | " + orderToDeliver.getName());
            orders.remove(index);
        } else {
            System.out.println("Order not found.");
        }
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getName());
        }
    }
}
