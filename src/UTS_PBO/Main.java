package UTS_PBO;

import java.io.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        Barang minuman = new Minuman(null, null, null, 0, 0);
        Minuman minum = new Minuman(null, null, null, 0, 0);  
        
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Penjualan");
            System.out.println("3. Keluar");
            int pilih = Integer.parseInt(input.readLine());
            
            switch (pilih){
                case 1:
                    minuman.entridata(minuman);
                    System.out.println("");
                    break;
                case 2:
                    minuman.entridata();
                    System.out.println("");
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
            
        } while (true);
    }   
}
