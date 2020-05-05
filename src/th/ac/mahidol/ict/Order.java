package th.ac.mahidol.ict;

import java.util.Date;

public class Order {

    private long orderNumber;
    private Date Date;
    private double subTotal = 0.0;
    private double tax = 0.0;
    private double shipping = 0.0;
    private double total = 0.0;
    private Customer customer;
    private State state;
    private ProductOrder[] productOrders;



    public Order() {
    }




    // ================= Getter Setter ====================


    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ProductOrder[] getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(ProductOrder[] productOrders) {
        this.productOrders = productOrders;
    }
}
