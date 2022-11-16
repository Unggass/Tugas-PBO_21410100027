package Tugas_Abstract_Interface;

import java.io.*;

public abstract interface Warung {
    
    public abstract void Makanan() throws IOException;
    public abstract void Minuman() throws IOException;
    public abstract void Pesan() throws IOException;
    void Nota();
    
}
