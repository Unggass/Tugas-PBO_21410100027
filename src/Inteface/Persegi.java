package Inteface;



public class Persegi extends SuperBentuk implements Bentuk {

    @Override
    public void cetak() {
        //Isi bebas
        
    }

    @Override
    public double luas() {
        super.sisi = 10;
       return super.sisi * super.sisi; 
    }

    @Override
    public double keliling() {
        super.sisi = 10;
        return super.sisi * super.sisi * super.sisi * super.sisi ;
    }
    
}
