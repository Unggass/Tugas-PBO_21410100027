package Tugas_Inhertiance;

import java.io.*;

public class CitiLink extends Tiket{
    private int penumpang;
    private int harga;
    private String tujuan;
    private String nopesawat;
    private String nokursi;
    
    public CitiLink(int penumpang, String tujuan, String nopesawat, String nokursi, String bookingid, String nik, String nama, String gender, String berangkat, String kembali, String kotaasal){
        super(bookingid, nik, nama, gender, berangkat, kembali, kotaasal);
        this.penumpang = penumpang;
        this.tujuan = tujuan;
        this.nopesawat = nopesawat;
        this.nokursi = nokursi;        
    }
    
    public String gettujuan(){
        return tujuan;
    }
    
    public String getnopesawat(){
        return nopesawat;
    }
    
    public String getnokursi(){
        return nokursi;
    }
    
    public int getpenumpang(){
        return penumpang;
    }
    
    public int getharga(){
        if (super.getkotaasal().equalsIgnoreCase("Surabaya")) {
            if ((gettujuan().equalsIgnoreCase("Bali")) || (gettujuan().equalsIgnoreCase("Lombok"))) {
                this.harga = 700000;
            }
            else if ((gettujuan().equalsIgnoreCase("jakarta")) || (gettujuan().equalsIgnoreCase("Yohyakarta"))) {
                this.harga = 800000;
            }
            else if ((gettujuan().equalsIgnoreCase("Balikpapan")) || (gettujuan().equalsIgnoreCase("Makassar"))) {
                this.harga = 850000;
            }
            else {
                System.out.println("Maaf tujuan anda tidak tersedia!!");
            }
        }
        else if (super.getkotaasal().equalsIgnoreCase("Jakarta")) {
            if ((gettujuan().equalsIgnoreCase("Bali")) || (gettujuan().equalsIgnoreCase("Lombok"))) {
                this.harga = 1000000;
            }
            else if ((gettujuan().equalsIgnoreCase("Surabaya")) || (gettujuan().equalsIgnoreCase("Yohyakarta"))) {
                this.harga = 750000;
            }
            else if ((gettujuan().equalsIgnoreCase("Balikpapan")) || (gettujuan().equalsIgnoreCase("Makassar"))) {
                this.harga = 900000;
            }
            else {
                System.out.println("Maaf tujuan anda tidak tersedia!!");
            }
        }
        return harga;
    }
    
    int gettotal(){
        return getharga() * getpenumpang();
    }
}