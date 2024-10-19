// Main.java
public class Main {
    public static void main(String[] args) {
        // Create an InvoiceItem object
        InvoiceItem item = new InvoiceItem("001", "Laptop", 3, 750.00);

        // Display the details of the item
        System.out.println("ID: " + item.getId());                // Output: 001
        System.out.println("Description: " + item.getDesc());     // Output: Laptop
        System.out.println("Quantity: " + item.getQty());         // Output: 3
        System.out.println("Unit Price: $" + item.getUnitPrice()); // Output: 750.0

        // Calculate and display the total price
        System.out.println("Total: $" + item.getTotal());         // Output: 2250.0

        // Change the quantity and update the total
        item.setQty(5);
        System.out.println("Updated Quantity: " + item.getQty());  // Output: 5
        System.out.println("Updated Total: $" + item.getTotal());  // Output: 3750.0

        // Change the unit price and update the total
        item.setUnitPrice(800.00);
        System.out.println("Updated Unit Price: $" + item.getUnitPrice()); // Output: 800.0
        System.out.println("Updated Total: $" + item.getTotal());  // Output: 4000.0

        // Display the object details using the overridden toString() method
        System.out.println(item);  // Output: InvoiceItem[id=001,desc=Laptop,qty=5,unitPrice=800.0]
    }
}
