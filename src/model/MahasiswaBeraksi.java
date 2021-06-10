package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630170";
        mahasiswa.nama = "Setiaji";
        mahasiswa.tanggallahir = simpleDateFormat.parse("23-09-2000");

        System.out.println("Nama\t\t\t: "+mahasiswa.nama);
        System.out.println("NPM\t\t\t\t: "+mahasiswa.npm);
        System.out.println("Tanggal Lahir\t: "+simpleDateFormat.format(mahasiswa.tanggallahir));

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630007";
        mahasiswa2.nama = "Ahmad";
        mahasiswa2.tanggallahir = simpleDateFormat.parse("04-12-2001");

        System.out.println("Nama\t\t\t: "+mahasiswa2.nama);
        System.out.println("NPM\t\t\t\t: "+mahasiswa2.npm);
        System.out.println("Tanggal Lahir\t: "+simpleDateFormat.format(mahasiswa2.tanggallahir));
    }
}