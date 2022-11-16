package UTS_PBO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Minuman extends Barang {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String jenis;
    int jumlahbeli;
    int total;
    int diskon;
    //SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy HH:mm:ss");
    //Date date = new Date();
    
    public Minuman(String kodebarang, String namabarang, String jenis, int harga, int stok){
        super(kodebarang, namabarang, harga, stok);
        this.jenis = jenis;
        this.jumlahbeli = jumlahbeli;
        this.total = total;
        this.diskon = diskon;
    }
    
    
    public String getjenis(){
        return jenis;
    }
    
    public int gettotal(){
        total = (super.getharga() * this.jumlahbeli);
        return total;
    }
    
    public int getdiskon(){
        int d;
        if (gettotal() > 200000) {
            diskon = (gettotal() * 10/100);
            
            d = gettotal() - diskon;
        }
        else{
            System.out.println("-");
        }
        return diskon;
    }
    
    @Override
    public int stokupdate(){
        stok = super.getstok();
        if (stok < 0) {
            System.out.println("Maaf Stok habis");
        }
        else{
            System.out.println("Stok masih ada");
        }
        
        return 0;
    }
    
    @Override
    public void entridata(Barang m) throws IOException{
        System.out.println("Kode Barang = ");
        this.kodebarang = input.readLine();
        System.out.println("Nama Barang = ");
        this.namabarang = input.readLine();
        System.out.println("Jenis Barang = ");
        this.jenis = input.readLine();
        System.out.println("Harga = ");
        this.harga = Integer.parseInt(input.readLine());
        System.out.println("Stok = ");
        this.stok = Integer.parseInt(input.readLine());        
    }
    
    @Override
    public void entridata() throws IOException{
        System.out.println("Data Penjualan");
        System.out.println("Kode Barang : ");
        String kode = input.readLine();
        
        if (kode.equalsIgnoreCase(this.kodebarang)) {
            System.out.println("Nama barang : " + super.getnamabarang());
            System.out.println("Jenis barang : " + getjenis());
            System.out.println("Harga : " + super.getharga());
            System.out.println("Stok saat ini : " + super.getstok());
        }
        
        System.out.println("Jumlah beli = ");
        this.jumlahbeli = Integer.parseInt(input.readLine());
        
        Minuman minuman = new Minuman(null, null, null, 0, 0);
        stokupdate();
        System.out.println("Total bayar: " + gettotal());
        if (gettotal() > 200000) {
            System.out.println("Selamat anda mendapatkan diskon 10%");
        }
        
        System.out.print("Ingin cetak struk? Ya/Tidak : ");
        String konfirm = input.readLine();
        if ((konfirm.equalsIgnoreCase("ya")) || (konfirm.equalsIgnoreCase("y")))        {
            struk();
        }
        else{
            System.out.println("Terima kasih telah berbelanja");
            System.exit(0);
        }
        
        System.out.println("Terima kasih telah berbelanja");
        System.out.println("--------------------------------------------------");
    }
    
    public void struk(){
        System.out.println("============================");
        System.out.println("\t\t Toko Anda \t\t");
        System.out.println("Tanggal : ");
        System.out.println("Kasir : Saya");
        System.out.println("============================");
        System.out.println("Nama barang : " + super.getnamabarang());
        System.out.println(this.jumlahbeli + " X " + super.getharga() + " = " + gettotal());
        System.out.println("============================");
        System.out.println("Subtotal : " + gettotal());
        if (gettotal() > 200000)
        {
            System.out.println("diskon = 10%");
            System.out.println("Total = " + getdiskon());
        }
        else
        {
            System.out.println("Diskon = 0");
            System.out.println("Total = " + gettotal());
        }
        System.out.println("================================");
    }
}
