/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no2_c_3060_revisi;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class commissionEmployee extends employee{
    private int gajiPokok, Komisi, totalPenjualan, totalGaji;

    
    public commissionEmployee(String nama, String nip, int gajipokok, int komisi, int totalpenjualan){
        super(nama,nip);
        gajiPokok = gajipokok;
        Komisi = komisi;
        totalPenjualan = totalpenjualan;
    }
    
    public int gajiPokok(){
        return gajiPokok;
    }
    
    public int Komisi(){
        return Komisi;
    }
    
    public int setTotalGaji(){
        totalGaji = gajiPokok + (Komisi * totalPenjualan);
        return totalGaji;
    }
    
    public void cetak(){
        System.out.println("Data Commission Employee");
        System.out.println("");
        super.cetak();
        System.out.println("Gaji Pokok      : Rp "+gajiPokok);
        System.out.println("Komisi          : Rp "+Komisi);
        System.out.println("Total Penjualan : "+totalPenjualan);
        System.out.println("Total Gaji      : Rp "+setTotalGaji());
    }
    
}
