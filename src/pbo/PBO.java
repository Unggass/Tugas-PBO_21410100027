package pbo;

import java.io.*;

//Class Undika
class Undika{
    private String nama, alamat;
    
    //Setter
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    
    //Getter
    public String getnama(){
        return nama;
    }
    
    public String getalamat(){
        return alamat;
    }
}


//class Mahasiswa
class Mahasiswa {
    private String nim, prodi;
    private int spp, angkatan, semester, bayarspp;
    
    //Setter
    public void setnim(String nim){
        this.nim = nim;
    }
    
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    
    public void setangkatan(int angkatan){
        this.angkatan = angkatan;
    }
    
    public void setsemester(int semester){
        this.semester = semester;
    }
    
    //Getter
    public String getnim(){
        return nim;
    }
    
    public String getprodi(){
        return prodi;
    }
    
    public int getangkatan(){
        return angkatan;
    }
    
    public int getsemester(){
        return semester;
    }
    
    public int getspp(){
        if (getangkatan() >= 17) {
            bayarspp = 15000000;
        }
        else   {
            bayarspp = 12000000;
        }
        int spp = bayarspp * getsemester();
        
        return spp;
    }            
}


//Class Karyawan
class Karyawan{
    private String nik, bagian;
    private int kehadiran, gajiharian, totalgaji;
    
    //Setter
    public void setnik(String nik){
        this.nik = nik;
    }
    
    public void setbagian(String bagian){
        this.bagian = bagian;
    }
    
    public void setkehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public void setgajiharian(int gajiharian){
        this.gajiharian = gajiharian;
    }
    
    //Getter
    public String getnik(){
        return nik;
    }
    
    public String getbagian(){
        return bagian;
    }
    
    public int getkehadiran(){
        return kehadiran;       
    }
    
    public int getgajiharian(){
        return gajiharian;
    }
    
    public int gettotalgaji(){
        totalgaji = getkehadiran() * getgajiharian();
        return totalgaji;
    }
}


public class PBO {
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        
        int pilih;
        Undika undika = new Undika();
        Mahasiswa mahasiswa = new Mahasiswa();
        Karyawan karyawan = new Karyawan();
        
        try{
            do {
                System.out.println("====== Menu ======");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawan");
                System.out.println("3. Keluar");
                System.out.println("==================");
                System.out.print("\nPilihan Menu : ");
                pilih = Integer.parseInt(input.readLine());
                
                switch (pilih){
                    case 1:
                        //Input Data
                        System.out.println("==== Input data Mahasiswa ====");
                        System.out.print("Nama : ");
                        undika.setnama(input.readLine());
                        System.out.print("Alamat : ");
                        undika.setalamat(input.readLine());
                        System.out.print("NIM : ");
                        mahasiswa.setnim(input.readLine());
                        System.out.print("Program Studi : ");
                        mahasiswa.setprodi(input.readLine());
                        System.out.print("Angkatan : ");
                        mahasiswa.setangkatan(Integer.parseInt(input.readLine()));
                        System.out.print("Semester : ");
                        mahasiswa.setsemester(Integer.parseInt(input.readLine()));
                        
                        //Output Data
                        System.out.println("\n==== SPP Mahasiswa ====");
                        System.out.println("Nama            : " + undika.getnama());
                        System.out.println("Alamat          : " + undika.getalamat());
                        System.out.println("NIM             : " + mahasiswa.getnim());
                        System.out.println("Program Studi   : " + mahasiswa.getprodi());
                        System.out.println("Angkatan        : " + mahasiswa.getangkatan());
                        System.out.println("Semester        : " + mahasiswa.getsemester());
                        System.out.println("SPP             : " + mahasiswa.getspp());
                        break;
                        
                    case 2:
                        //input data
                        System.out.println("\n==== Input Data Karyawan ====");
                        System.out.print("Nama : ");
                        undika.setnama(input.readLine());
                        System.out.print("Alamat : ");
                        undika.setalamat(input.readLine());
                        System.out.print("Nik : ");
                        karyawan.setnik(input.readLine());
                        System.out.print("Bagian : ");
                        karyawan.setbagian(input.readLine());
                        System.out.print("Kehadiran : ");
                        karyawan.setkehadiran(Integer.parseInt(input.readLine()));
                        System.out.print("Gaji Perhari : ");
                        karyawan.setgajiharian(Integer.parseInt(input.readLine()));
                        
                        //Output
                        System.out.println("Nama            : " + undika.getnama());
                        System.out.println("Alamat          : " + undika.getalamat());
                        System.out.println("Nik             : " + karyawan.getnik());
                        System.out.println("Bagian          : " + karyawan.getbagian());
                        System.out.println("Kehadiran       : " + karyawan.getkehadiran());
                        System.out.println("Gaji            : " + karyawan.gettotalgaji());
                        break;
                        
                    case 3:
                        System.exit(0);
                        break;
                }
                
            } while (true);
            
        }catch (Exception e){
            System.out.println("Kesalahan dalam meng-Input");
        }
    }
    
}
