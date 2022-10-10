package Tugas_Inhertiance;


public class Tiket {
    private String bookingid;
    private String nik;
    private String nama;
    private String gender;
    private String berangkat;
    private String kembali;
    private String kotaasal;
    
    public Tiket(String bookingid, String nik, String nama, String gender, String berangkat, String kembali, String kotaasal){
        this.bookingid = bookingid;
        this.nik = nik;
        this.nama = nama;
        this.gender = gender;
        this.berangkat = berangkat;
        this.kembali = kembali;
        this.kotaasal = kotaasal;
    }
    
    public String getbookingid(){
        return bookingid;
    }
    public String getnik(){
        return nik;
    }
    public String getnama(){
        return nama;
    }
    public String getgender(){
        return gender;
    }
    public String getberangkat(){
        return berangkat;
    }
    public String getkembali(){
        return kembali;
    }
    public String getkotaasal(){
        return kotaasal;
    }
}