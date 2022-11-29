/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no2_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class CommissionEmployee_3060 {
    //atribut
    private String nama_3060, nip_3060;
    private long gajiPokok_3060, totalGaji_3060;
    private int komisi_3060, totalPenjualan_3060;
    
    //konstruktor default
    public CommissionEmployee_3060(){
        
    }
    
    public CommissionEmployee_3060(String a, String b, long c, int d, int e){
        nama_3060 = a;
        nip_3060 = b;
        gajiPokok_3060 = c;
        komisi_3060 = d;
        totalPenjualan_3060 = e;
    }
    
    //method overloading
    public void upah(long totalGaji_3060, int komisi, long gajiPokok_3060, int totalPenjualan_3060){
        totalGaji_3060 = (long) (gajiPokok_3060) + (komisi_3060 * totalPenjualan_3060);
    }
    
    public void upah(){
        totalGaji_3060 = (long) (gajiPokok_3060) + (komisi_3060 * totalPenjualan_3060);
    }
    
    //method
    public void cetak(){
        System.out.println("Commission Employee");
        System.out.println("Nama            : "+nama_3060);
        System.out.println("NIP             : "+nip_3060);
        System.out.println("Gaji Pokok      : Rp "+gajiPokok_3060);
        System.out.println("Komisi          : Rp "+komisi_3060);
        System.out.println("Total Penjualan : "+totalPenjualan_3060);
        System.out.println("Total Gaji      : Rp "+totalGaji_3060);
    }
    
}
