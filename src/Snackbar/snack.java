package Snackbar;

public class Snack{
   private static int maxId = 0;
   private int id;
   private String name;
   private int quantity;
   private double cost;
   private int vendingMachineId;

    public Snack( String name, int quantity, double cost, int vendingMachineId,{
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public Snack(){

    }

   public int getMaxId(){
       return maxId;
   }
   public int getId(){
       return id;
   }
   public String getName(){
       return name;
   }
   public int getQuantity(){
       return quantity;
   }
   public int addQuantity(){
       return quantity + int;
   }
   public double getCost(){
       return cost;
   }
   public int getVendingMachineId(){
       return vendingMachineId;
   }
   public void setName(String name){
       this.name = name;
   }
   public void setCost(double cost){
       this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId){
        this.vendingMachineId = vendingMachineId;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        String rtnStr = "id:" + id + "\n"+
        "name:" + name + "\n"+
        "cost:" + cost + "\n"+
        "vendingMachineId:" + vendingMachineId + "\n"+
        "quantity:" + quantity;
        return rtnStr;
    }
}