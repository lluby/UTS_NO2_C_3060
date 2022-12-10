/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.uts_no2_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class UTS_NO2_C_3060 {

    public static void main(String[] args) {
        employee a;
        SalariedEmployee_3060 b = new SalariedEmployee_3060("Nana","413243",150000,7);
        b.cetak();
        System.out.println("");
        
        CommissionEmployee c = new CommissionEmployee("Lylia","542422",4200000,550000,10);
        c.cetak();
        System.out.println("");
        
        ProjectPlanner_3060 d = new ProjectPlanner_3060("Joy","425352",5000000,600000,15);
        d.cetak();
        System.out.println("");
    }
    
}
    
