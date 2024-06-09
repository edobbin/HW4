import java.util.ArrayList;
import java.util.Iterator;
//holds command interface an individual commands
import java.util.Scanner;

interface Command {
    void execute();
}

class SubmitOrderCommand implements Command {
    private Aggregator agg;
    

    public SubmitOrderCommand(Aggregator agg) {
        this.agg = agg;
    }

    @Override
    public void execute() {
        Orders order = agg.getOrders();
        Menu menu = agg.getMenu();
        Menu side = agg.getSides();
        Iterator<OrderItem> iterator = order.createIterator();
        ArrayList<MenuItem> temp = new ArrayList<MenuItem>();
        double tot = 0;
        while (iterator.hasNext()) {
            OrderItem orderItem = iterator.next();
            MenuItem it;
            if(orderItem.getSideNum()==0){
            it = menu.getItemByNum(orderItem);
            }else{
                it = menu.addSide( 
                new MenuItem(orderItem.getItemNum(), menu.getItemByNum(orderItem).getName(), menu.getItemByNum(orderItem).getPrice())
                , new MenuItem(orderItem.getSideNum(), side.getItemByNum(orderItem).getName(), side.getItemByNum(orderItem).getPrice())
                );
            }
            
            temp.add(it);
            tot += it.getPrice();
            
        }
        Tab tab = new Tab(tot, temp);
        tab.printTab();
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to add a tip(y/n): ");
        String read = input.next();
        if(read.equalsIgnoreCase("y")){
            double amount;
            System.out.print("How much would you like to give: ");
            amount = input.nextDouble();
            TipAdapter tipad = new TipAdapter(tab, amount);
            tipad.printTab();
        }
    else{
        System.out.println("Thank you have a nice day.");
        
    }

        System.exit(1);

    }

}

// display tab command

class DisplayTabCommand implements Command {
    private Aggregator agg;

    public DisplayTabCommand(Aggregator agg) {
        this.agg = agg;
    }

    @Override
    public void execute() {
        Orders order = agg.getOrders();
        Menu menu = agg.getMenu();
        Menu side = agg.getSides();
        Iterator<OrderItem> iterator = order.createIterator();
        System.out.println("----------------------------------------");
        System.out.println("Current Tab:\n");
        while (iterator.hasNext()) {
            OrderItem orderItem = iterator.next();
            MenuItem it;
            if(orderItem.getSideNum()==0){
            it = menu.getItemByNum(orderItem);
            }else{
            it = menu.addSide( 
                new MenuItem(orderItem.getItemNum(), menu.getItemByNum(orderItem).getName(), menu.getItemByNum(orderItem).getPrice())
                , new MenuItem(orderItem.getSideNum(), side.getItemByNum(orderItem).getName(), side.getItemByNum(orderItem).getPrice())
                );
            }
            System.out.println(it.toString());
        }
        System.out.println("----------------------------------------");
    }

}

// display menu command
class DisplayMenuCommand implements Command {
    private Aggregator agg;

    public DisplayMenuCommand(Aggregator agg) {
        this.agg = agg;
    }

    @Override
    public void execute() {
        Menu menu = agg.getMenu();
        Iterator<MenuItem> iterator = menu.createIterator();
        System.out.println("------------------MENU-----------------");
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.toString());
        }

        System.out.println("----------------------------------------");
    }
}

// display menu command
class DisplaySidesCommand implements Command {
    private Aggregator agg;

    public DisplaySidesCommand(Aggregator agg) {
        this.agg = agg;
    }

    @Override
    public void execute() {
        Menu Sides = agg.getSides();
        Iterator<MenuItem> iterator = Sides.createIterator();
        System.out.println("------------------Sides-----------------");
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.toString());
        }
        System.out.println("----------------------------------------");
    }
}
