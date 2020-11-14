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


public class Rabbit extends Animal{
    private final String color;
    private final String name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
}
