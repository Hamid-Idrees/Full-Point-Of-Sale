
package entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Store {
    
    //static fields
    private static final ArrayList<Product> products;              //stock products
    private static final ArrayList<Employee> employees;
    private static final ArrayList<Invoice> invoices;
    
    static{
        products = new ArrayList();
        employees = new ArrayList();
        invoices = new ArrayList();
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    public static String forgetPassword(String u_name){
        for (int i = 0; i < employees.size(); i++) {
            if (u_name.equals(employees.get(i).getU_name())){
                return employees.get(i).getPassword();
            }
        }
        return null;    
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    public static boolean verify_emp(String u_name,String pass){
        for (int i = 0; i < employees.size(); i++) {
            if (u_name.equals(employees.get(i).getU_name())&&
                    pass.equals(employees.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    public static void addEmployee(Employee e){
        if (e!=null) {
            employees.add(e);
        }
        else
            showErrorMessage("Employee data not received");    
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    public static void deleteProduct(Product obj){
        for (int i = 0; i < products.size(); i++) {
            if (obj.getPid()==products.get(i).getPid()) {
                products.remove(i);
            }
        }
        System.out.println(products.size());
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    public static void updateProduct(int id, Product obj){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPid()==id) {
                products.get(i).setName(obj.getName());
                products.get(i).setCategory(obj.getCategory());
                products.get(i).setW_sale_price(obj.getW_sale_price());
                products.get(i).setR_price(obj.getR_price());
                products.get(i).setStock(obj.getStock());
                showErrorMessage("Product updated successfully");
            }
        }
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    
    public static void dummyProducts() {
    products.add(new Product(1, "Kitkat", "Snacks", 10, 100, 150));
    products.add(new Product(2, "Fish", "Meat", 100, 1800, 2000));
    products.add(new Product(3, "Lays", "Snacks", 50, 60, 90));
    products.add(new Product(4, "Bread", "Bakery", 60, 150, 180));
    products.add(new Product(5, "Apple", "Fruits", 70, 150, 200));
    products.add(new Product(6, "Juice", "Drinks", 30, 120, 150));
    products.add(new Product(7, "Carrots", "Vegetables", 80, 50, 90));
    products.add(new Product(8, "Milk", "Dairy", 40, 220, 290));
    products.add(new Product(9, "Pizza", "Frozen Foods", 25, 1150, 1200));
    products.add(new Product(10, "Mars", "Snacks", 40, 80, 100));
    products.add(new Product(11, "Cheese", "Dairy", 20, 150, 200));
    products.add(new Product(12, "Beef", "Meat", 50, 2800, 3000));
    products.add(new Product(13, "Magnum", "Frozen Foods", 10, 250, 300));
}

    
    
    ////////////////////////////////////////////////////////////////////////////
    
//    public Store(){
//        products = new ArrayList();
//    }
    
    public static void showErrorMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);    
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    //search product by name
    public static Product searchProductByName(String name){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                return products.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Product not found");    
        return null;
    } 
    
    ////////////////////////////////////////////////////////////////////////////
    
    //add product
    public static void addProduct(Product obj){
        if(obj!=null){
            products.add(obj);    
            JOptionPane.showMessageDialog(null, "Product added successfully");
        }
        else{
            JOptionPane.showMessageDialog(null, "Product data not recieved");
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    
    // add invoice
    public static void addInvoice(Invoice invoice) {
    if (invoice != null) {
        invoices.add(invoice);
    } 
    else {
        JOptionPane.showMessageDialog(null, "Invoice data not received");
    }
}

    
    ////////////////////////////////////////////////////////////////////////////
    

    public static ArrayList<Invoice> getInvoices() {
    return invoices;
    }
    
    
    
    public static ArrayList<Product> getAllProducts(){
        return products;    
    }
    
}
