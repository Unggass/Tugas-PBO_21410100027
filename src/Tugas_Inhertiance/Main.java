package UTS_Ganjil_Penjualan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MainClass
{
  public static void main(String[] args)
    throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Barang m = new Minuman();
    Minuman min = new Minuman();
    for (;;)
    {
      System.out.println("--- Menu Toko Kita ---");
      System.out.println("1. Entri Data Barang");
      System.out.println("2. Entri Data Penjualan");
      System.out.println("3. Keluar");
      System.out.print("Pilih menu : ");
      int menu = Integer.parseInt(br.readLine());
      System.out.println("");
      switch (menu)
      {
      case 1: 
        m.entriData(m);
        System.out.println("");
        break;
      case 2: 
        m.entriData();
        System.out.println("");
        break;
      case 3: 
        System.exit(0);
      }
    }
  }
}
