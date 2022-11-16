package UTS_PBO;

import java.io.*;

public class Barang {
    String kodebarang;
    String namabarang;
    int harga;
    int stok;
    
    public Barang (String kodebarang, String namabarang, int harga, int stok){
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;
        this.harga = harga;
        this.stok = stok;
    }
    
    
    public String getnamabarang(){
        return namabarang;
    }
    
    public String getkodebarang(){
        return kodebarang;
    }
    
    public int getharga(){
        return harga;
    }
    
    public int getstok(){
        return stok;
    }
    
    public int stokupdate(){
        return 0;
    }
    
    public void entridata(Barang m) throws IOException{
        
    }
    
    public void entridata() throws IOException{
        
    }
}


