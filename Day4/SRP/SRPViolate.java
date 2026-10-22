import java.util.*;
class Product{
    public String name;
    public double price;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }
}
class ShoppingCart{
    private List<Product> products=new ArrayList<>();
    public void addProducts(Product p){
        products.add(p);
    }
    public double calculateTotal(){
        double total=0;
        for(Product p:products){
            total+=p.price;
        }
        return total;
    }
    public void printInvoice(){
        System.out.println("Shopping cart Invoice");
        for(Product p:products){
            System.out.println(p.name +" -Rs "+p.price);
        }
        System.out.println("Total: Rs "+calculateTotal());
    }

    public void saveToDB(){
        System.out.println("Saving shopping cart to database...");
    }

}
public class SRPViolate {
    public static void main(String[] args){
        ShoppingCart cart=new ShoppingCart();
        cart.addProducts(new Product("Laptop",5000));
        cart.addProducts(new Product("mounse",2000));

        cart.printInvoice();
        cart.saveToDB();

    }
}
