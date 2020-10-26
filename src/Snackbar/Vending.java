package Snackbar;

public class Vending{
    private static int maxId = 0;
    private int id;

    public Vending(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}