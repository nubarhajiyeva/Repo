/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.constructor;

/**
 *
 * @author NUBAR
 */
public class Mushteri {
    public static void main(String[] args) {
        Mashin Leman=new Mashin();
        System.out.println("Leman");
        System.out.println(Leman.ad);
        System.out.println(Leman.power);
        System.out.println(Leman.color);
    
        Mashin Serxan=new Mashin("infinity", 580,"mavi");
        System.out.println("Serxan");
        System.out.println(Serxan.ad);
        System.out.println(Serxan.power);
        System.out.println(Serxan.color);
        
        Mashin Nubar=new Mashin (500, "sari");
        System.out.println("Nubar");
        System.out.println(Nubar.ad);
        System.out.println(Nubar.power);
        System.out.println(Nubar.color);
        
        
    }
}
