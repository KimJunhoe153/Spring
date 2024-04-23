package dw.model;

public class Department {
    private long departId;
    private String departName;

    public Department() {
    }

    public Department(long departId, String departName) {
        this.departId = departId;
        this.departName = departName;
    }

    public long getDepartId() {
        return departId;
    }

    public void setDepartId(long departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}

