package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggallahir;

    void menyapa() {
        System.out.println("Hai nama aku : " + nama);
    }
    String getNama(){
        return nama;
    }
}

