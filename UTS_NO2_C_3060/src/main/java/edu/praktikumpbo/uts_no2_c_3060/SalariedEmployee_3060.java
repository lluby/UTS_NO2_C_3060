/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no2_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class SalariedEmployee_3060 extends employee{
    private int upah_3060;
    private int Jumlah, totalUpah;
    
    public SalariedEmployee_3060(String nama, String nip, int upah, int jumlah){
    super(nama,nip);
    upah_3060 = upah;
    Jumlah = jumlah;
    
    }
    
    public int upah(){
        return upah_3060;
    }
    
    public int setTotalUpah(){
        totalUpah = upah_3060 * Jumlah;
        return totalUpah;
    }
    
    public void cetak(){
        System.out.println("Data Saleried Employee");
        System.out.println("");
        super.cetak();
        System.out.println("Upah Mingguan   : Rp "+upah_3060);
        System.out.println("Total Upah      : Rp "+setTotalUpah());
    }
}
