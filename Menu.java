import java.util.ArrayList;
import java.util.Iterator;

/**
 * Menu
 */

public class Menu implements iMenu {
    private ArrayList<MenuItem> menu;

    public Menu() {
        menu = new ArrayList<MenuItem>();
    }
    public void addItem(MenuItem item){
    menu.add(item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menu.iterator();
    }
    @Override
    public MenuItem getItem(String item) {
        for(int i = 0; i< menu.size(); i++){
            if(menu.get(i).getName().equalsIgnoreCase(item))
                return menu.get(i);
        }
        return null;
    }


    public MenuItem getItemByNum(OrderItem item) {
        for(int i = 0; i< menu.size(); i++){
            if(item.getItemNum() == menu.get(i).getNum())
                return menu.get(i);
        }
        return null;
    }

    public MenuItem getSideByNum(OrderItem item) {
        for(int i = 0; i< menu.size(); i++){
            if(item.getSideNum() == menu.get(i).getNum())
                return menu.get(i);
        }
        return null;
    }

    public MenuItem addSide(MenuItem menuItem, MenuItem sideitem) {
        MenuItemDecorator menuItemWithSide = new SideDecorator(menuItem, sideitem);
        return new MenuItem (menuItem.getNum(), menuItemWithSide.getDescription(),menuItemWithSide.getPrice());
    }

    //for testing
    public void test(){
        for (MenuItem menuItem : menu) {
            System.out.println(menuItem.toString());
        }
    }
    
}