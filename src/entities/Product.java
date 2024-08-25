
package entities;


public class Product {
   
    private int pid;
    private String name;
    private String category;
    private int stock;
    private double w_sale_price;
    private double r_price;

    public Product(){
    
    }
    
    // constructor
    public Product(int pid, String name, String category, int stock, double w_sale_price, double r_price) {
        this.pid = pid;
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.w_sale_price = w_sale_price;
        this.r_price = r_price;
    }

    // getter setter
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getW_sale_price() {
        return w_sale_price;
    }

    public void setW_sale_price(double w_sale_price) {
        this.w_sale_price = w_sale_price;
    }

    public double getR_price() {
        return r_price;
    }

    public void setR_price(double r_price) {
        this.r_price = r_price;
    }
    
    
    
    
}
