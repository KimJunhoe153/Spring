package dw.model;

public class Customer {
    private long customerId;
    private String customerName;
    private String customerEmployee;
    private String employeeTitle;
    private String address;
    private String city;
    private String area;
    private int phoneNumber;
    private int mileage;

    public Customer() {
    }

    public Customer(long customerId, String customerName, String customerEmployee,
                    String employeeTitle, String address, String city, String area, int phoneNumber, int mileage) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmployee = customerEmployee;
        this.employeeTitle = employeeTitle;
        this.address = address;
        this.city = city;
        this.area = area;
        this.phoneNumber = phoneNumber;
        this.mileage = mileage;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmployee() {
        return customerEmployee;
    }

    public void setCustomerEmployee(String customerEmployee) {
        this.customerEmployee = customerEmployee;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
