/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no2_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class SalariedEmployee_3060 {
    private String nama_3060, nip_3060;
    private long UpahMingguan_3060, total_3060;
    private int jmlhMinggu_3060;
    
    //konstruktor default
    public SalariedEmployee_3060(){
        
    }
    
    //konstruktor
    public SalariedEmployee_3060(String a, String b, long c, int d){
        nama_3060 = a;
        nip_3060 = b;
        UpahMingguan_3060 = c;
        jmlhMinggu_3060 = d;
    }
    
    // method overloading
    public void upah(long total_3060, long UpahMingguan, int jmlhHari){
        total_3060 = UpahMingguan_3060 * jmlhMinggu_3060;
    }
    
    public void upah(){
        total_3060 = UpahMingguan_3060 * jmlhMinggu_3060;
    }
    
    
    
    public void cetak(){
        System.out.println("Salaried Employee");
        System.out.println("Nama            : "+nama_3060);
        System.out.println("NIP             : "+nip_3060);
        System.out.println("Upah Minguan    : Rp "+UpahMingguan_3060);
        System.out.println("Jumlah Minggu   : "+jmlhMinggu_3060);
        System.out.println("Jumlah Gaji     : Rp "+total_3060);
    }
}
