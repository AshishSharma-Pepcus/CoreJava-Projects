package com.ashish;

 class cheeseBurgers {
    private String name;
    private String cheese;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void addAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public cheeseBurgers(String name, String cheese, double price, String breadRollType) {
        this.name = name;
        this.cheese = cheese;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public double totalSet(){
        double vegCheeseBurgerPrice = this.price;
        System.out.println(this.name+ " VegCheeseBurger on a " +this.breadRollType +" roll, and " +this.cheese+ " price is " + this.price );

        if(this.addition1Name != null){
            vegCheeseBurgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name +
                               " for an extra " +this.addition1Price);
        }
        if(this.addition2Name != null){
            vegCheeseBurgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name +
                               " for an extra " +this.addition2Price);
        }
        if(this.addition3Name != null){
            vegCheeseBurgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name +
                               " for an extra " +this.addition3Price);
        }
        if(this.addition4Name != null){
            vegCheeseBurgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name +
                               " for an extra " +this.addition4Price);
        }
        return vegCheeseBurgerPrice;
    }

}
class HealthyBurger extends cheeseBurgers{
     private String healthyExtra1Name;
     private double healthyExtra1Price;

     private String healthyExtra2Name;
     private double healthyExtra2Price;

    public HealthyBurger(String cheese, double price) {
        super("Healthy", cheese, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double totalSet() {
        double chesseburgerPrice =  super.totalSet();
        if(this.healthyExtra1Name!=null){
            chesseburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name +" for an extra"+ this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name!=null){
            chesseburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name +"for an extra"+ this.healthyExtra2Price);
        }

       return chesseburgerPrice;
    }
}

class DeluxBurger extends cheeseBurgers{
    public DeluxBurger() {
        super("Delux", "Amul cheese + DesiGhee", 150, "Mustart-Beans-White");
        super.addAddition1("Chips", 5);
        super.addAddition2("Drink", 25);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Can't add to delux burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Can't add to delux burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Can't add to delux burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Can't add to delux burger");
    }
}
public class Veg_cheese_Burgers {
    public static void main(String[] args) {
        cheeseBurgers cb = new cheeseBurgers("Basic","Amul_cheese",80, "White");
       // double price = cb.totalSet();
        cb.addAddition1("Corn",15);
        cb.addAddition2("capsicum",20);
        cb.addAddition3("tomato",25);
        cb.addAddition4("mixedSalad",35);
        double price = cb.totalSet();

        HealthyBurger hb = new HealthyBurger("Ghee",100);

        hb.addAddition1("mustard", 5);
        hb.totalSet();
        hb.addHealthAddition1("Soya",20);
        System.out.println("Total healthy burger price is: "+hb.totalSet());

        DeluxBurger db = new DeluxBurger();
        db.totalSet();
        db.addAddition1("tomato", 10);

    }
}

