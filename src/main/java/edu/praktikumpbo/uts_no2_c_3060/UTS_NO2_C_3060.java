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
        SalariedEmployee_3060 a = new SalariedEmployee_3060("Nana","34743",500000,5);
        a.upah();
        a.cetak();
        System.out.println("");
        
        CommissionEmployee_3060 b = new CommissionEmployee_3060("Lylia","42514",4000000,500000,10);
        b.upah();
        b.cetak();
        System.out.println("");
        
        ProjectPlanner_3060 c = new ProjectPlanner_3060("Hanabi","54232",4500000,550000,6);
        c.upah();
        c.cetak();
        
    }
}
