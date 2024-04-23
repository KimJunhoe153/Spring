package dw.model;

public class Product {
    private long productId;
    private String productName;
    private String pkgUnit;
    private int unitPrice;
    private int inventory;

    public Product() {
    }

    public Product(long productId, String productName, String pkgUnit, int unitPrice, int inventory) {
        this.productId = productId;
        this.productName = productName;
        this.pkgUnit = pkgUnit;
        this.unitPrice = unitPrice;
        this.inventory = inventory;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPkgUnit() {
        return pkgUnit;
    }

    public void setPkgUnit(String pkgUnit) {
        this.pkgUnit = pkgUnit;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
