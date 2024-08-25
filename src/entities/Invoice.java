
package entities;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    
    private String customerName;
    private String customerAddress;
    private ArrayList<Product> products;
    private double totalBill;
    private double paymentReceived;
    private double balance;
    private Date date;

    // Constructor
    public Invoice(String customerName, String customerAddress, ArrayList<Product> products, double totalBill, double paymentReceived, double balance, Date date) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.products = products;
        this.totalBill = totalBill;
        this.paymentReceived = paymentReceived;
        this.balance = balance;
        this.date = date;
    }

    // Getters and Setters
    public String getCustomerName() { return customerName; }
    public String getCustomerAddress() { return customerAddress; }
    public ArrayList<Product> getProducts() { return products; }
    public double getTotalBill() { return totalBill; }
    public double getPaymentReceived() { return paymentReceived; }
    public double getBalance() { return balance; }
    public Date getDate() { return date; }
}

   