package Tugas_Abstract_Interface;

import java.io.*;

public class Menu extends SuperWarung implements Warung{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    public Menu (String JenisMakan, String NamaMakan, int BanyakMakan, int HargaMakan, String JenisMinum, String NamaMinum, int BanyakMinum, int HargaMinum, int Total){
        super(JenisMakan, NamaMakan, BanyakMakan, HargaMakan, JenisMinum, NamaMinum, BanyakMinum, HargaMinum, Total);
    }
    
    public String getJenisMakan(){
        return JenisMakan;
    }
    
    public String getNamaMakan(){
        return NamaMakan;
    }
    
    public int getHargaMakan(){
        return HargaMakan;
    }
    
    public int getHargaMakanMakan(){
        return HargaMakan;
    }
    
    public int getHargaMinumMakan(){
        return HargaMakan;
    }
    
    public int getBanyakMakan(){
        return BanyakMakan;
    }
    
    public String getJenisMinum(){
        return JenisMinum;
    }
    
    public String getNamaMinum(){
        return NamaMinum;
    }
    
    public int getHargaMinum(){
        return HargaMinum;
    }
    
    public int getHargaMakanMinum(){
        return HargaMinum;
    }
    
    public int getHargaMinumMinum(){
        return HargaMinum;
    }
    
    public int getBanyakMinum(){
        return BanyakMinum;
    }
    
    public int getTotal(){
        
        Total = (getHargaMakan() * getBanyakMakan()) + (getHargaMinum() * getBanyakMinum());
        
        return Total;
    }
    
    public void Makanan() throws IOException{
        System.out.println("Ingin Makan Nasi atau Mie ?");
        System.out.print("Jenis Makanan : ");
        this.JenisMakan = input.readLine();
        
        if (JenisMakan.equalsIgnoreCase("Nasi")) {
            System.out.println("Kami Menyediakan Sebagai Berikut :");
            System.out.println("\n1. Nasi Goreng, \n2. Nasi Kuah\n");
            System.out.println("Pilih Menu apa ?");
            System.out.print("Nama Makanan : ");
            this.NamaMakan = input.readLine();
            
            if (NamaMakan.equalsIgnoreCase("Nasi Goreng")) {
                this.HargaMakan = 20000;
                System.out.println("Harga 1 Porsi = Rp" + getHargaMakan());
            }
            else if (NamaMakan.equalsIgnoreCase("Nasi Kuah")) {
                this.HargaMakan = 15000;
                System.out.println("Harga 1 Porsi = Rp" + getHargaMakan());
            }
            
        }
        else if (JenisMakan.equalsIgnoreCase("Mie")) {
            System.out.println("Kami Menyediakan Sebagai Berikut :");
            System.out.println("\n1. Mie Goreng, \n2. Mie Kuah\n");
            System.out.println("Pilih Menu apa ?");
            System.out.print("Nama Makanan : ");
            this.NamaMakan = input.readLine();
            
            if (NamaMakan.equalsIgnoreCase("Mie Goreng")) {
                this.HargaMakan = 15000;
                System.out.println("Harga 1 Porsi = Rp" + getHargaMakan());
            }
            else if (NamaMakan.equalsIgnoreCase("Mie Kuah")) {
                this.HargaMakan = 10000;
                System.out.println("Harga 1 Porsi = Rp" + getHargaMakan());
            }
        }
        System.out.println("Ingin Membeli Berapa Porsi ?");
        System.out.print("Berapa Porsi : ");
        this.BanyakMakan = Integer.parseInt(input.readLine());
    }
    
    public void Minuman() throws IOException{
        System.out.println("Ingin Minuman Dingin Atau Hangat ?");
        System.out.print("Jenis Minuman : ");
        this.JenisMinum = input.readLine();
        
        if (JenisMinum.equalsIgnoreCase("Dingin")) {
            System.out.println("Kami Menyediakan Sebagai Berikut :");
            System.out.println("\n1. Es Teh, \n2. Es Jeruk\n");
            System.out.println("Pilih Menu apa ?");
            System.out.print("Nama Minuman : ");
            this.NamaMinum = input.readLine();
            
            if (NamaMinum.equalsIgnoreCase("Es Teh")) {
                this.HargaMinum = 11000;
                System.out.println("Harga 1 Gelas = Rp" + getHargaMinum());
            }
            else if (NamaMinum.equalsIgnoreCase("Es Jeruk")) {
                this.HargaMinum = 16000;
                System.out.println("Harga 1 Gelas = Rp" + getHargaMinum());
            }
            
        }
        else if (JenisMinum.equalsIgnoreCase("Hangat")) {
            System.out.println("Kami Menyediakan Sebagai Berikut :");
            System.out.println("\n1. Teh Hangat, \n2. Jeruk Hangat\n");
            System.out.println("Pilih Menu apa ?");
            System.out.print("Nama Minuman : ");
            this.NamaMinum = input.readLine();
            
            if (NamaMinum.equalsIgnoreCase("Teh Hangat")) {
                this.HargaMinum = 10000;
                System.out.println("Harga 1 Gelas = Rp" + getHargaMinum());
            }
            else if (NamaMinum.equalsIgnoreCase("Jeruk Hangat")) {
                this.HargaMinum = 15000;
                System.out.println("Harga 1 Gelas = Rp" + getHargaMinum());
            }
        }
        
        System.out.println("Ingin Membeli Berapa Gelas ?");
        System.out.print("Berapa Gelas : ");
        this.BanyakMinum = Integer.parseInt(input.readLine());
    }
    
    
    @Override
    public void Pesan() throws IOException{
        Makanan();
        
        System.out.print("Apakah Ingin tambah Minuman ? Y/N : ");
        String Tambah = input.readLine();
            if (Tambah.equalsIgnoreCase("Y")) {
                Minuman();
            }
            
            System.out.println("");
            
            Nota();
            System.exit(0);
    }
    
    @Override
    public void Nota() {
        System.out.println("== Nota Belanja ==");
        System.out.println(getJenisMakan() + " | " + getNamaMakan());
        System.out.println("Harga \t: " + getHargaMakan());
        System.out.println("Jumlah \t: x" + getBanyakMakan());
        System.out.println("");
        System.out.println(getJenisMinum() + " | " + getNamaMinum());
        System.out.println("Harga \t: " + getHargaMinum());
        System.out.println("Jumlah \t: x" + getBanyakMinum());
        System.out.println("=================================");
        System.out.println("Total Pembelian \t: " + getTotal());
    }
}
