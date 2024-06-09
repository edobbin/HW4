import java.util.Iterator;

public class test2 {
    public static void main(String[] args) {
        iOrders ORD = new Orders();

        iMenu menu = new Menu();

        // Add some menu items
        menu.addItem(new MenuItem(1,"Pizza", 10.99));
        menu.addItem(new MenuItem(2,"Burger", 8.49));
        menu.addItem(new MenuItem(3,"Salad", 6.99));

        // Add some menu items
        ORD.addItem(new OrderItem(1));
        ORD.addItem(new OrderItem(2));
        ORD.addItem(new OrderItem(2));
        Aggregator agg = new Aggregator();
        agg.setMenu((Menu) menu);
        
        agg.setOrders((Orders) ORD);
        // Iterate over the menu items using iterator
        // Command tab = new DisplayTabCommand(agg);
        // CommandInvoker.executeCommand(tab);

        SystemInterface.DisplayMenu(agg);
    }
}
