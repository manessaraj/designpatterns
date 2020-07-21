package observer;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("10");
        PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);
        order.addItem(50);
        System.out.println(order);
        order.addItem(170);
        System.out.println(order);
    }
}
