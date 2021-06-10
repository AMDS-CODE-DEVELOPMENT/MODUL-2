package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630170";
        mahasiswa.nama = "Setiaji";

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);
        try {
            mahasiswa.tanggallahir = simpleDateFormat.parse("23-09-2000");
        } catch (ParseException e) {
            System.err.println("Format Tanggal Salah");
        }
        mahasiswa.tampilkanAtribut();
        System.out.println(mahasiswa.hitungUsia());

        Mahasiswa m = new Mahasiswa("19630001","Jaya",new Date());
        m.tampilkanAtribut();
    }
}