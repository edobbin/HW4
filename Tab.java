import java.util.*;

public class Tab implements iTab{
    private double total;
    private ArrayList<MenuItem> order;

    public Tab(double total, ArrayList<MenuItem> arr) {
        this.total = total;
        order = arr;
    }
    public double getTotal() {
        return total;
    }

    
    public void printTab(){
        System.out.println("Order Submitted!!!");
        System.out.println("----------------------------------------");
        for (MenuItem menuItem : order) {
        System.out.println(menuItem.getName()+" - $"+menuItem.getPrice());
        }

        System.out.println("\nTotal: $"+ total);
        System.out.println("----------------------------------------");

    }
}
