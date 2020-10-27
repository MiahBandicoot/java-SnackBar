package Snackbar;

public class Customer{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;


    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCash(){
        return cash;
    }
    public void setName(String name){
        this.name = name;
    }
}