package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    private String npm;
    private String nama;
    private Date tanggallahir;

    public Mahasiswa() {
        System.out.println("Objek diciptakan");
    }

    public Mahasiswa(String npm, String nama, Date tanggallahir) {
        this.npm = npm;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
    }

    void menyapa() {
        System.out.println("Hai nama aku : " + nama);
    }

    String getNama(){
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    void tampilkanAtribut(){
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);
        System.out.println("Nama\t\t\t: "+this.nama);
        System.out.println("NPM\t\t\t\t: "+this.npm);
        System.out.println("Tanggal Lahir\t: "+simpleDateFormat.format(this.tanggallahir));

        this.menyapa();
        }
         int hitungUsia(){
             Calendar tanggalLahir = Calendar.getInstance();
             tanggalLahir.setTime(this.tanggallahir);
             Calendar hariIni = Calendar.getInstance();

             int tahunTanggalLahir = tanggalLahir.get(Calendar.YEAR);
             int tahunHariIni = hariIni.get(Calendar.YEAR);
             int selisihTahun = tahunHariIni - tahunTanggalLahir;

             int bulanTanggalLahir = tanggalLahir.get(Calendar.MONTH);
             int bulanHariIni = hariIni.get(Calendar.MONTH);

             if (bulanHariIni < bulanTanggalLahir){
                 selisihTahun--;
             }else{
                 int tanggalTanggalLahir = tanggalLahir.get(Calendar.DAY_OF_MONTH);
                 int tanggaHariIni = hariIni.get(Calendar.DAY_OF_MONTH);
                 if (bulanHariIni == bulanTanggalLahir && tanggaHariIni < tanggalTanggalLahir){
                    selisihTahun--;
                 }
             }

             return selisihTahun;
        }
    }


