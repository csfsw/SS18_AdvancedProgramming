package collections;
public class Item{
    private static int lastid =1;
    private int id;
    private String name;
    private int instock;
    private double price;
    public Item(){
        id = lastid++;
    }
    public Item(String name, int instock, double price){
        id = lastid++;
        this.name = name;
        this.instock = instock;
        this.price = price;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setStock(int newstock){
        this.instock = newstock;
    }
    public int getStock(){
        return instock;
    }
    public void setPrice(double newprice){
        this.price = newprice;
    }
    public double getPrice(){
        return price;
    }
}