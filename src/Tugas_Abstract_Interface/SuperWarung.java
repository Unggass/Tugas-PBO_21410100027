package Tugas_Abstract_Interface;

import java.io.IOException;



public class SuperWarung implements Warung{
    
    String JenisMakan;
    String NamaMakan;
    int BanyakMakan;
    int HargaMakan;
    String JenisMinum;
    String NamaMinum;
    int BanyakMinum;
    int HargaMinum;
    int Total;
    
    public SuperWarung(String JenisMakan, String NamaMakan, int BanyakMakan, int HargaMakan, String JenisMinum, String NamaMinum, int BanyakMinum, int HargaMinum, int Total){
        this.JenisMakan = JenisMakan;
        this.NamaMakan = NamaMakan;
        this.BanyakMakan = BanyakMakan;
        this.HargaMakan = HargaMakan;
        this.JenisMinum = JenisMinum;
        this.NamaMinum = NamaMinum;
        this.BanyakMinum = BanyakMinum;
        this.HargaMinum = HargaMinum;
    }

    @Override
    public void Makanan() throws IOException {
        
    }

    @Override
    public void Minuman() throws IOException {
        
    }

    @Override
    public void Pesan() throws IOException {
        
    }

    @Override
    public void Nota() {
        
    }
    
    
    
}
