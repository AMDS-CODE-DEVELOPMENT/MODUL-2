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
            mahasiswa.tanggallahir = simpleDateFormat.parse("09-23-2000");
            System.out.println("Nama\t\t\t: "+mahasiswa.nama);
            System.out.println("NPM\t\t\t\t: "+mahasiswa.npm);
            System.out.println("Tanggal Lahir\t: "+simpleDateFormat.format(mahasiswa.tanggallahir));

            mahasiswa.menyapa();
        } catch (ParseException e) {
            System.err.println("Format Tanggal Salah");
        }
    }
}