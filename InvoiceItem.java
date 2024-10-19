// InvoiceItem.java
public class InvoiceItem {
    // Private fields for InvoiceItem
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor to initialize InvoiceItem
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Getter for description
    public String getDesc() {
        return desc;
    }

    // Getter for quantity
    public int getQty() {
        return qty;
    }

    // Setter for quantity
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for unit price
    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter for unit price
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate total (unitPrice * qty)
    public double getTotal() {
        return unitPrice * qty;
    }

    // Override toString() method to display InvoiceItem details
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}
