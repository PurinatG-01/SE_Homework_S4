package th.ac.mahidol.ict;

public class State {

    private String state;
    private float taxRate;
    private Order[] orders;

    public State() {
    }


    // ================= Getter Setter ====================


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

}