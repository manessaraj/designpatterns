package Strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter{


    @Override
    public void print(Collection<Order> orders) {
        System.out.println("********** Summary Report **********");
        Iterator<Order> iterator= orders.iterator();
        int count = 0;
        double total = 0;
        while (iterator.hasNext()) {
            count ++;
            Order order = iterator.next();
            System.out.println(count + ". " + order.getId() +
                    "\t" + order.getDate() + "\t" + order.getItems().size()+"\t"
                    + order.getTotal());
            total += order.getTotal();
        }
        System.out.println("Total: " + total);
        System.out.println("********** *********** **********");
    }
}
