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


public class Main{
    public static void main(String[] args) {
        Rabbit oo1 = new Rabbit("Peter",true,"Grass",4,"Grey");
        System.out.println("Hello, his name is " + oo1.getName());
        System.out.println(oo1.getName() + " is Vegetarian? " + oo1.isVegetarian());
        System.out.println(oo1.getName() + " eat " + oo1.getEats());
        System.out.println(oo1.getName() + " has " + oo1.getNoOfLegs() + " legs");
        System.out.println(oo1.getName() + " color is " + oo1.getColor());
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
}
