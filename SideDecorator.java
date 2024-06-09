public class SideDecorator implements MenuItemDecorator {
    private MenuItem menuItem;
    private String sideDescription;
    private double sidePrice;

    public SideDecorator(MenuItem menuItem, MenuItem sidItem) {
        this.menuItem = menuItem;
        this.sideDescription = sidItem.getName();
        this.sidePrice = sidItem.getPrice();
    }

    @Override
    public String getDescription() {
        return menuItem.getName() + " with " + sideDescription;
    }

    @Override
    public double getPrice() {
        return menuItem.getPrice() + sidePrice;
    }
}
