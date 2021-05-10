/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenjualanRumah;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class PenjualanRumah {
  
    private String nomertransaksi;
    private String tanggal;
    private String nama;
    private String jeniskelamin;
    private String alamat;
    private String pekerjaan;
    int blok;
    int typerumah;
    int bayar;
    Scanner input = new Scanner (System.in);
    
    
    public void setnomertransaksi (String nomertransaksi){
        this.nomertransaksi = nomertransaksi;
    }
    public String getnomertransaksi (){
        return this.nomertransaksi;
    }
    public void settanggal (String tanggal){
        this.tanggal = tanggal;
    }
    public String gettanggal (){
        return this.tanggal;
    }
    public void setnama (String nama){
        this.nama = nama;
    }
    public String getnama (){
        return this.nama;
    }
    public void setjeniskelamin (String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    public String getjeniskelamin (){
        return this.jeniskelamin;
    }
    public void setalamat (String alamat){
        this.alamat = alamat;
    }
    public String getalamat (){
        return this.alamat;
    }
    public void setpekerjaan (String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    public String getpekerjaan (){
        return this.pekerjaan;
    }
    public void blok (){
        System.out.println("1. Asri A");
        System.out.println("2. Asri B");
        System.out.println("3. Asri C");
        System.out.println("4. Asri D");
        System.out.println("5. Asri E");
        System.out.println("========================================");        
        System.out.print("Pilih Blok [1-5] : ");
        blok = input.nextInt();
        
        switch (blok){
            case 1:
                System.out.println("=======================================");
                System.out.println("Blok Rumah Anda * Asri A * ");
                System.out.println("=======================================");
                break;
            case 2:
                System.out.println("========================================");
                System.out.println("Blok Rumah Anda * Asri B * ");
                System.out.println("========================================");
                break;
            case 3:
                System.out.println("========================================");
                System.out.println("Blok Rumah Anda * Asri C * ");
                System.out.println("========================================");
                break;
            case 4:
                System.out.println("========================================");
                System.out.println("Blok Rumah Anda * Asri D * ");
                System.out.println("========================================");
                break;
            case 5:
                System.out.println("========================================");
                System.out.println("Blok Rumah Anda * Asri E * ");
                System.out.println("========================================");
                break;
        }
    }
    public void typerumah (){
        System.out.println("1. Tipe 21");
        System.out.println("2. Tipe 36");
        System.out.println("3. Tipe 45");
        System.out.println("========================================");
        System.out.print("Piih Tipe [1-3]  : ");
        typerumah = input.nextInt();
        
        switch (typerumah){
            case 1:
                System.out.println("========================================");
                System.out.println("Tipe Rumah Anda * Tipe 21 * ");
                System.out.println("Luas Tanah      * 50 - 60 meter persegi * ");
                System.out.println("Harga Rumah     * 300 juta * ");
                System.out.println("========================================");
                break;
            case 2:
                System.out.println("========================================");
                System.out.println("Tipe Rumah Anda * Tipe 36 * ");
                System.out.println("Luas Tanah      * 60 - 72 meter persegi * ");
                System.out.println("Harga Rumah     * 400 juta * ");
                System.out.println("========================================");
                break;
            case 3:
                System.out.println("========================================");
                System.out.println("Tipe Rumah Anda * Tipe 45 * ");
                System.out.println("Luas Tanah      * 72 - 96 meter persegi * ");
                System.out.println("Harga Rumah     * 500 juta * ");
                System.out.println("========================================");
                break;
        }
    }
    public void bayar(){
        System.out.println("1. LUNAS ");
        System.out.println("2. CICILAN / bln");
        System.out.println("========================================");
        System.out.println("Pilih Metode Pembayara [1-2] : ");
        System.out.println("========================================");
        bayar = input.nextInt();
        
        switch(bayar){
            case 1:
                System.out.println("====================================");
                System.out.println("Metode Pembayaran * LUNAS *");
                System.out.println("Terima Kasih Atas Pembeliannya");
                System.out.println("====================================");
                break;
            case 2:
                System.out.println("====================================");
                System.out.println("Metode Pembayaran * CICILAN / bln * ");
                System.out.println("Silahkan Berdiskusi Dengan Pihak Pembayaran");
                System.out.println("Terima Kasih Dan Selamat Menyicil");
                System.out.println("====================================");
                break;
        }
    }
    
}




    
    
    


