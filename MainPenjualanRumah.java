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
public class MainPenjualanRumah {

    public static void main(String[] args) {
        PenjualanRumah Asri = new PenjualanRumah();
        Asri.setnomertransaksi("1234567");
        Asri.settanggal("01 Juni 2005");
        Asri.setnama("Dinda Nola Dimelda");
        Asri.setjeniskelamin("Perempuan");
        Asri.setalamat("Jalan Kapi Janula VI");
        Asri.setpekerjaan("Programmer");
        
        System.out.println("          MENU PENJUALAN RUMAH          ");
        System.out.println("         PERUMAHAN PERMATA ASRI         ");
        System.out.println("    JL. Maluku Barat No. 509 Malang     ");
        System.out.println("========================================");         
        System.out.println("Nomer Transaksi : "+ Asri.getnomertransaksi());
        System.out.println("Tanggal         : "+ Asri.gettanggal());
        System.out.println("========================================");
        System.out.println("DATA PEMBELI");
        System.out.println("========================================");
        System.out.println("Nama            : "+ Asri.getnama());
        System.out.println("Jenis Kelamin   : "+ Asri.getjeniskelamin());
        System.out.println("Alamat          : "+ Asri.getalamat());
        System.out.println("Pekerjaan       : "+ Asri.getpekerjaan());
        System.out.println("========================================");
        System.out.println("DATA RUMAH");
        System.out.println("========================================");
        Asri.blok();
        Asri.typerumah();
        System.out.println("TRANSAKSI");
        System.out.println("========================================");
        Asri.bayar();
    }
    
    
}
