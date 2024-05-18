package entites;

public class Product3 {
    private String name;
    private double price;
    private int quantity;

    public Product3(){
    }
    public Product3(String name , double price , int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product3(String name , double price){
        this.name = name;
        this.price = price;
    }
   
    public String getName(String name){
        return name;
    }
   
    public void setName(String name){
        this.name = name;
    }
   
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(double price){
        return price;
    }
   
    public int getQuantity(int quantity){
        return quantity;
    }


}
