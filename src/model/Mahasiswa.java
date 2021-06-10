package model;

import java.text.ParseException;
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

    void tampilkanAtribut(){
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.println("Nama\t\t\t: "+this.nama);
        System.out.println("NPM\t\t\t\t: "+this.npm);
        System.out.println("Tanggal Lahir\t: "+simpleDateFormat.format(this.tanggallahir));

        this.menyapa();
        } catch (
        ParseException e) {
            System.err.println("Format Tanggal Salah");
         }
    }
}

