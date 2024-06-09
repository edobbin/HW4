import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**
 * UserInterface
 */
public class UserInterface {
    iMenu menu;
    iOrders order;
    iMenu sides;
    Aggregator agg;

    public UserInterface() {
        agg = new Aggregator();
        order = new Orders();
        menu = new Menu();
        sides = new Menu();
        loadSides();
        loadMenu();
       // ((Menu) menu).test();
        agg.setMenu((Menu)menu);
        agg.setOrders((Orders) order);
        agg.setSides((Menu) sides);
        interFace();
    }
    String[] options ={
        "1. Look at menu",
        "2. Add item to order",
        "3. remove item from order",
        "4. Show current Tab",
        "5. Submit Order",

        "0. Exit"
    };

    public void interFace(){
        Scanner input = new Scanner(System.in);
        int read=-1;
        while (read !=0) {
         printOptions();
        System.out.print("Option: ");
        read = input.nextInt();
        choice(read);   
        }
        

        
    }

    public void loadMenu(){
        menu.addItem(new MenuItem(1,"Pizza", 10.99));
        menu.addItem(new MenuItem(2,"Burger", 8.49));
        menu.addItem(new MenuItem(3,"Salad", 6.99));
        menu.addItem(new MenuItem(4,"Wings", 7.99));
        menu.addItem(new MenuItem(5,"Fillet Mingon", 67.49));
        menu.addItem(new MenuItem(6,"Chicken Tenders", 4.99));
        

        
        System.out.println("\n------MENU LOADED!!!------\n");
    }
    public void loadSides(){
        sides.addItem(new MenuItem(1,"Fries", 4.99));
        sides.addItem(new MenuItem(2,"Calamari", 4.49));
        sides.addItem(new MenuItem(3,"shrimp", 4.99));
        sides.addItem(new MenuItem(4,"chips", 4.99));
        
        
        System.out.println("\n------Sides LOADED!!!------\n");
    }

    

    public void choice(int i){
        
        switch (i) {
            case 0:
                System.exit(0);
                break;
            case 1:
           
                SystemInterface.DisplayMenu(agg);
                break;
            case 2:
                addToOrder();

                break;
            case 3:
                removeFromOrder();
                break;
            case 4:
                SystemInterface.DisplayTab(agg);
                break;
            case 5:
                SystemInterface.SubmitOrder(agg);
                break;
            
        
            default:
                break;
        }

    }

    public void printOptions(){
        for (String string : options) {
            System.out.println(string);
        }
    }

    public void addToOrder(){
        Scanner input = new Scanner(System.in);
        int read=-1;
        SystemInterface.DisplayMenu(agg);
        System.out.println();
        System.out.println("What would you like?");
        System.out.print("Option: ");
        read = input.nextInt();
        

        System.out.print("would you like a side?(y/n) ");
        String res = input.next();
        if(res.equalsIgnoreCase("y")){
            SystemInterface.DisplaySides(agg);
            System.out.println("What would you like?");
            System.out.print("Option: ");
            int read2 = input.nextInt();

            OrderItem t = new OrderItem(read,read2); 

            System.out.println( t.getItemNum()+" "+t.getSideNum());
            order.addItem(t);
            
        }
        else{
           OrderItem t = new OrderItem(read); 
           order.addItem(t);
        }


    }

    
    public void removeFromOrder(){
        Scanner input = new Scanner(System.in);
        SystemInterface.DisplayTab(agg);
        System.out.println("Enter the item number: ");
        int opt = input.nextInt();
        order.Remove(new OrderItem(opt));


    }
}