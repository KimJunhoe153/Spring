package dw.model;

public class Order {
    private long orderId;
    private String customer;
    private String employee;
    private int orderDate;
    private int requestDate;
    private int shippingDate;

    public Order() {
    }

    public Order(long orderId, String customer, String employee,
                 int orderDate, int requestDate, int shippingDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        this.requestDate = requestDate;
        this.shippingDate = shippingDate;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }

    public int getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(int requestDate) {
        this.requestDate = requestDate;
    }

    public int getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(int shippingDate) {
        this.shippingDate = shippingDate;
    }
}
