package Inteface;



public class Main {
    public static void main (String [] args){
        Bentuk b = new Persegi();
        
        System.out.println("Luas : " + b.luas());
        System.out.println("Keliling : " + b.keliling());
    }
}
