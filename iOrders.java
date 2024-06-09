import java.util.Iterator;

public interface iOrders {
    Iterator<OrderItem> createIterator();

    void addItem(OrderItem orderItem);

    void Remove(OrderItem orderItem);
}
