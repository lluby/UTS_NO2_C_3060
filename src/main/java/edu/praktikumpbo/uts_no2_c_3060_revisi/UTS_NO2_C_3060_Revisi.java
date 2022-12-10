/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.uts_no2_c_3060_revisi;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class UTS_NO2_C_3060_Revisi {

    public static void main(String[] args) {
        employee a;
        salariedEmployee b = new salariedEmployee("Nana","4132432",150000,7);
        b.cetak();
        System.out.println("");
        
        commissionEmployee c = new commissionEmployee("Lylia","542422",4200000,550000,10);
        c.cetak();
        System.out.println("");
        
        projectPlanner d = new projectPlanner("Joy","425352",5000000,600000,15);
        d.cetak();
        System.out.println("");
    }
    
}
