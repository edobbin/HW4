public class OrderItem {
    private int itemNum;
    private int sideNum;

    public OrderItem(int itemNum) {
        this.itemNum = itemNum;
        sideNum = 0;
    }

    public OrderItem(int itemNum, int sideNum) {
        this.itemNum = itemNum;
        this.sideNum = sideNum;
    }


    public int getItemNum() {
        return itemNum;
    }
    public int getSideNum() {
        return sideNum;
    }
}
