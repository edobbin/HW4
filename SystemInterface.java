public class SystemInterface {

    public static void DisplayMenu(Aggregator agg){
       // System.out.println("TEST");
        Command tab = new DisplayMenuCommand(agg);
        CommandInvoker.executeCommand(tab);
    }

    public static void DisplaySides(Aggregator agg){
        // System.out.println("TEST");
         Command tab = new DisplaySidesCommand(agg);
         CommandInvoker.executeCommand(tab);
     }

    public static void SubmitOrder(Aggregator agg){
        Command tab = new SubmitOrderCommand(agg);
        CommandInvoker.executeCommand(tab);
    }

    public static void DisplayTab(Aggregator agg){
        // Iterate over the menu items using iterator
        Command tab = new DisplayTabCommand(agg);
        CommandInvoker.executeCommand(tab);
    }
}
