public class Aggregator {

    static Menu menu;
    static Orders orders;
    static Menu sides;

    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getSides() {
        return sides;
    }
    public void setSides(Menu sides) {
        this.sides = sides;
    }


    public Orders getOrders() {
        return orders;
    }
    public void setOrders(Orders order) {
        this.orders = order;
    }
}
