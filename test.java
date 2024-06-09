import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        iMenu menu = new Menu();

        // Add some menu items
        menu.addItem(new MenuItem(1,"Pizza", 10.99));
        menu.addItem(new MenuItem(2,"Burger", 8.49));
        menu.addItem(new MenuItem(3,"Salad", 6.99));

        // Iterate over the menu items using iterator
        Iterator<MenuItem> iterator = menu.createIterator();
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
