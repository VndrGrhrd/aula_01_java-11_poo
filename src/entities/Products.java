package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueStock(){
       return this.price * this.quantity;

    }

    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
}
