package Strategy;

import java.util.LinkedList;
import java.util.List;

//Context 
public class PrintService{

    private OrderPrinter printer;
    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }

}
