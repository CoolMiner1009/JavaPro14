package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        // Додавання замовлень
        Order order1 = new Order("Alen");
        orderBoard.add(order1);

        Order order2 = new Order("Yoda");
        orderBoard.add(order2);

        Order order3 = new Order("Obi-van");
        orderBoard.add(order3);

        Order order4 = new Order("John Snow");
        orderBoard.add(order4);

        // Виведення поточного стану черги
        orderBoard.draw();

        // Видача найближчого замовлення
        orderBoard.deliver();

        // Видача замовлення з певним номером
        orderBoard.deliver(3);

        // Виведення оновленого стану черги
        orderBoard.draw();
    }
}
