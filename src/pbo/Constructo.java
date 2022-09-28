package pbo;



import java.io.*;


class Akun{
     
    private String username, password;
    
    public Akun(){
        username = "Admin";
        password = "Admin";
    }
    
    public Akun(String user, String pass){
        username = user;
        password = pass;
    }
    
    public void setpassword(String password){
        this.password = password;
    }
    
    public String getusername(){
        return username;
    }
    
    public String getpassword(){
        return password;
    }
    
}

public class Constructo {
   public static void main(String [] args) throws IOException{
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
       Akun admin = new Akun();
       Akun newakun = new Akun("", "");
       
       String username, password;
       
       do {
           
        //Menu
        System.out.println("==== Login ====");
        System.out.println("1. Login Admin");
        System.out.println("2. Buat akun baru");
        System.out.println("3. Lihat akun");
        System.out.println("4. Ubah Password");
        System.out.println("5. Keluar");
        System.out.print("\nPilihan Menu : ");
        int pilih = Integer.parseInt(input.readLine());
       
        switch(pilih){
            case 1:
                System.out.println("=== Login Admin ===");
               
                System.out.print("Masukkan Username : ");
                username = input.readLine();
                System.out.print("Masukkan Password : ");
                password = input.readLine();
               
                if (username.equalsIgnoreCase(admin.getusername()) && password.equals(admin.getpassword())) {
                    System.out.println("Login Sukses!!!");
               }
                else {
                    System.err.println("Terdapat kesalahan dalam menginputkan Username atau Password!!!");
                }
                break;
               
            case 2:
                System.out.println("=== Buat Akun ===");
               
                System.out.println("=== Login Admin ===");
                System.out.print("Masukkan Username : ");
                username = input.readLine();
                System.out.print("Masukkan Password : ");
                password = input.readLine();
               
                newakun = new Akun(username, password);
                break;
               
            case 3:
                System.out.println("=== Lihat Akun ===");
                System.out.println("1. Admin");
                System.out.println("Username : " + admin.getusername());
                System.out.println("Password : " + admin.getpassword());
               
                System.out.println("\n2. Akun baru");
                System.out.println("Username : " + newakun.getusername());
                System.out.println("Password : "+ newakun.getpassword());
                break;
                
            case 4:
                System.out.println("=== Ubah Password ===");
                
                System.out.print("Input Username : ");
                username = input.readLine();
                System.out.print("Input Password Lama : ");
                password = input.readLine();
                
                if (username.equalsIgnoreCase(newakun.getusername()) && password.equals(newakun.getpassword())) {
                    //newakun = new Akun(username, password); => gadipake
                    
                    System.out.print("Masukkan Password baru : ");
                    newakun.setpassword(input.readLine());
                    
                    System.out.println("Ubah Password Berhasil!!!");
                    
                    //newakun = new Akun(username, password); => gadipake
                }
                else{
                    System.err.println("Terdapat kesalahan dalam menginput Username atau Password!!!");
                }
                break;
                
            case 5:
                System.exit(0);
                break;
        }  
       
       } while (true);

       
   }
}
