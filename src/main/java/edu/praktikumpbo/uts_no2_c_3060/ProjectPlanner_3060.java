/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no2_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class ProjectPlanner_3060 {
    //atribut
    private String nama_3060, nip_3060;
    private long gajiPokok_3060, totalGaji_3060;
    private int komisi_3060, totalProyek_3060;
    private int pajak_3060;
    
    // konstruktor default
    public ProjectPlanner_3060(){
        
    }
    
    //konstruktor
    public ProjectPlanner_3060(String a, String b, long c, int d, int e){
        nama_3060 = a;
        nip_3060 = b;
        gajiPokok_3060 = c;
        komisi_3060 = d;
        totalProyek_3060 = e;
    }
    
    public int pajak(){
        pajak_3060 = (int) (gajiPokok_3060 * 5) / 100;
        return pajak_3060;
    }
    
    //method overloading
    public void upah(long totalGaji_3060, int komisi, long gajiPokok_3060, int totalProyek_3060){
        totalGaji_3060 = (long) (gajiPokok_3060) + (komisi_3060 * totalProyek_3060) - pajak();
    }
    
    public void upah(){
        totalGaji_3060 = (long) (gajiPokok_3060) + (komisi_3060 * totalProyek_3060) - pajak();
    }
    
    public void cetak(){
        System.out.println("Planning Planner");
        System.out.println("Nama            : "+nama_3060);
        System.out.println("NIP             : "+nip_3060);
        System.out.println("Gaji Pokok      : Rp "+gajiPokok_3060);
        System.out.println("Komisi          : Rp "+komisi_3060);
        System.out.println("Total Proyek    : "+totalProyek_3060);
        System.out.println("Total Gaji      : Rp "+totalGaji_3060);
    }
}
