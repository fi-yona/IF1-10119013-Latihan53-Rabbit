/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan53.rabbit;

/**
 *
 * @author Fiona Avila
 */


public class Animal {
    
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    
    public boolean isVegetarian(){
        return false;
    }
    
    public String getEats(){
        return eats;
    }
    
    public int getNoOfLegs(){
        return noOfLegs;
    }
}
