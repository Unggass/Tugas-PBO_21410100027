package Tugas_Abstract_Interface;

import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader input = new BufferedReader ( new InputStreamReader(System.in));        
        
        Warung Menu = new Menu(null, null, 0, 0, null, null, 0, 0, 0);
        
        System.out.println("====== Selamat Datang =======");
        System.out.println("==== Warung Pak Dhe Brim ====");
        
        do {
            
            Menu.Pesan();
            
        } while (true);
       
    }
}
