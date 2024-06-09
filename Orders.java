import java.util.*;

public class Orders implements iOrders{
    private ArrayList<OrderItem> items;

    private ArrayList<MenuItem> allItem;

    public Orders() {
        items = new ArrayList<OrderItem>();
        allItem = new ArrayList<MenuItem>();
    }
    
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void addd(MenuItem menuItem){
        
    }

    @Override
    public Iterator<OrderItem> createIterator() {
        return items.iterator();
    }

    @Override
    public void Remove(OrderItem orderItem) {
        items.remove(orderItem);
    }
    
}
