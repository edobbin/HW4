public class TipAdapter implements iTab {
    Tab t;
    double tip;
    public TipAdapter(Tab tab, double tip) {
        this.t = tab;
        this.tip = tip;
    }
    @Override
    public void printTab() {
        System.out.println("New total: "+ (t.getTotal()+tip));
    }
    
}
