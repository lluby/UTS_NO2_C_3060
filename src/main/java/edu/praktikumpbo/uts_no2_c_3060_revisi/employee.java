/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no2_c_3060_revisi;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public abstract class employee {
    private String nama_3060;
    private String nip_3060;
    
    public employee(String nama, String nip){
    nama_3060 = nama;
    nip_3060 = nip;
    }
    public String nama(){
        return nama_3060;
    }
    
    public String nip(){
        return nip_3060;
    }
    
    public void cetak(){
        System.out.println("Nama            : "+nama_3060);
        System.out.println("NIP             : "+nip_3060);
    }
}
