/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no2_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class ProjectPlanner_3060 extends employee{
    private int gajiPokok, Komisi, totalProyek, Pajak, totalGaji;
    
    public ProjectPlanner_3060(String nama, String nip, int gajipokok, int komisi, int totalproyek){
        super(nama,nip);
        gajiPokok = gajipokok;
        Komisi = komisi;
        totalProyek = totalproyek;
    }
    
    public int gajiPokok(){
        return gajiPokok;
    }
    
    public int Komisi(){
        return Komisi;
    }
    
    public int totalProyek(){
        return totalProyek;
    }
    
    public int setPajak(){
        Pajak = (gajiPokok * 5) / 100;
        return Pajak;
    }
    
    public int setTotalGaji(){
        totalGaji = gajiPokok + (Komisi * totalProyek) - setPajak();
        return totalGaji;
    }
    
    public void cetak(){
        System.out.println("Data Project Planner");
        System.out.println("");
        super.cetak();
        System.out.println("Gaji Pokok      : Rp "+gajiPokok);
        System.out.println("Komisi          : Rp "+Komisi);
        System.out.println("Total Proyek    : "+totalProyek);
        System.out.println("Pajak           : Rp "+setPajak());
        System.out.println("Total Gaji      : Rp "+setTotalGaji());
    }
    
}
