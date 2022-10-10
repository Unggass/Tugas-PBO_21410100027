package Tugas_Inhertiance;

import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        
        
        String kembali = null;
        String lagi = null;
        int total = 0;
        
        System.out.println("==== Pelayanan penerbangan Pesawat ====");
        System.out.print("Masukkan Jumlah Penumpang : ");
        int penumpang = Integer.parseInt(input.readLine());        
        
        LionAir[] LionAir = new LionAir[penumpang];
        CitiLink[] Citilink = new CitiLink[penumpang];
        
        do {
            System.out.println("\n=== Data Penumpang ===");
            System.out.println("Penumpang");
            System.out.print("Lokasi kota Asal : ");
            String asal = input.readLine();
            
            if (asal.equalsIgnoreCase("Surabaya")) {
                System.out.println("Lokasi Tujuan yang tersedia : \n[Bali, Lombok, Yogyakarta, Balikpapan, Makassar, Jakarta]");
            }
            
            else if (asal.equalsIgnoreCase("Jakarta")) {
                System.out.println("Lokasi Tujuan yang tersedia : \n[Bali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar");
            }
            
            else{
                System.err.println("Maaf Terjadi kesalahan dalam System!!");
                System.exit(0);
            }
            
            System.out.print("Masukkan Tujuan anda : ");
            String tujuan = input.readLine();
            System.out.print("Tanggal Pemberangkatan DD/MM/YY : ");
            String berangkat = input.readLine();
            System.out.print("Pulang pergi ? Ya/Tidak : ");
            String pp = input.readLine();
            if (pp.equalsIgnoreCase("Ya")) {
                System.out.print("Tanggal Kembali : ");
                kembali = input.readLine();
            }
            
            System.out.println("\n=== Maskapai Penerbangan yang Tersedia ===");
            System.out.println("1. Citilink");
            System.out.println("2. Lion Air");
            System.out.println("==========================================");
            System.out.print("Masukkan Maska[ai penerbangan : ");
            int maskapai = Integer.parseInt(input.readLine());
            
            switch (maskapai){
                case 1:
                    System.out.println("== Maskapai Citilink ==");
                    System.out.println("= Input data Penumpang =");
                    for (int i = 0; i < Citilink.length; i++) {
                        System.out.print("Booking Id : ");
                        String bookingid = input.readLine();
                        System.out.print("NIK : ");
                        String nik = input.readLine();
                        System.out.print("Nama : ");
                        String nama = input.readLine();
                        System.out.print("Jenis Kelamin P/L : ");
                        String gender = input.readLine();
                        System.out.print("Nomor Pesawat : ");
                        String nopesawat = input.readLine();
                        System.out.print("Nomor Kuris : ");
                        String nokursi = input.readLine();
                        
                        Citilink[i] = new CitiLink(penumpang, tujuan, nopesawat, nokursi, bookingid, nik, nama, gender, berangkat, kembali, asal);
                        System.out.println("");
                    }
                    
                    for (int i = 0; i < Citilink.length; i++) {
                        System.out.println("\n===== Data Tiket =====");
                        System.out.println("Booking Id : " + Citilink[i].getbookingid());
                        System.out.println("NIK : " +  Citilink[i].getnik());
                        System.out.println("Nama : " +  Citilink[i].getnama());
                        System.out.println("Kota Asal : " +  Citilink[i].getkotaasal());
                        System.out.println("Tujuan : " +  Citilink[i].gettujuan());
                        System.out.println("Tanggal Pemberangkatan : " +  Citilink[i].getberangkat());
                        System.out.println("Tanggal Kembali : " +  Citilink[i].getkembali());
                        System.out.println("Nomor Pesawat : " +  Citilink[i].getnopesawat());
                        System.out.println("Nomor Kursi : " +  Citilink[i].getnokursi());
                        System.out.println("Harga Tiket : " +  Citilink[i]. getharga()); 
                        
                        total =  Citilink[i].gettotal();
                    }
                    
                    System.out.println("===================================================");
                    System.out.println("\t\tTotal Transaksi : " + total);  
                    System.out.println("");
                    System.out.print("Ingin melakukan transaksi lagi ? Y/N");
                    lagi = input.readLine();
                    if (lagi.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                    break;
                    
                case 2:
                    System.out.println("== Maskapai LionAir ==");
                    System.out.println("= Input data Penumpang =");
                    for (int i = 0; i < LionAir.length; i++) {
                        System.out.print("Booking Id : ");
                        String bookingid = input.readLine();
                        System.out.print("NIK : ");
                        String nik = input.readLine();
                        System.out.print("Nama : ");
                        String nama = input.readLine();
                        System.out.print("Jenis Kelamin P/L : ");
                        String gender = input.readLine();
                        System.out.print("Nomor Pesawat : ");
                        String nopesawat = input.readLine();
                        System.out.print("Nomor Kuris : ");
                        String nokursi = input.readLine();
                        
                        LionAir[i] = new LionAir(penumpang, tujuan, nopesawat, nokursi, bookingid, nik, nama, gender, berangkat, kembali, asal);
                        System.out.println("");
                    }
                    
                    for (int i = 0; i < LionAir.length; i++) {
                        System.out.println("\n===== Data Tiket =====");
                        System.out.println("Booking Id : " + LionAir[i].getbookingid());
                        System.out.println("NIK : " +  LionAir[i].getnik());
                        System.out.println("Nama : " +  LionAir[i].getnama());
                        System.out.println("Kota Asal : " +  LionAir[i].getkotaasal());
                        System.out.println("Tujuan : " +  LionAir[i].gettujuan());
                        System.out.println("Tanggal Pemberangkatan : " +  LionAir[i].getberangkat());
                        System.out.println("Tanggal Kembali : " +  LionAir[i].getkembali());
                        System.out.println("Nomor Pesawat : " + LionAir[i].getnopesawat());
                        System.out.println("Nomor Kursi : " +  LionAir[i].getnokursi());
                        System.out.println("Harga Tiket : " +  LionAir[i]. getharga()); 
                        
                        total =  LionAir[i].gettotal();
                    }
                    
                    System.out.println("===================================================");
                    System.out.println("\t\tTotal Transaksi : " + total);  
                    System.out.println("");
                    System.out.print("Ingin melakukan transaksi lagi ? Y/N");
                    lagi = input.readLine();
                    if (lagi.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                    break;
                    
                case 3:
                    System.err.println("Error!!!");
                    System.exit(0);
                    break;
                    
            }
            
        } while (true);
    }
}