public class MenuItem implements iMenuItem {
    private String name;
    private double price;
    //item
    private int num;

    public MenuItem(int num, String name, double price) {
        this.name = name;
        this.price = price;
        this.num = num;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;    
    }
    public int getNum(){
        return num;
    }
    
    @Override
    public String toString() {
        return num +" - " + name +" - " + price+'\n';
    }
}
