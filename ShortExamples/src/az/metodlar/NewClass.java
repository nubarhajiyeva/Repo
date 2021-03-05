/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.metodlar;

/**
 *
 * @author NUBAR
 */
public class NewClass {
    public void tipsizMetod() {
        System.out.println("Bu tipsiz metoddur");
    }
    
    public String tipliMetod() {
        System.out.println("bu String  tipli metoddur");
        return "SALAM NUBAR:)" ;
    }
    public static void main(String[] args) {
        NewClass nc=new NewClass();
        nc.tipsizMetod();
        System.out.println(nc.tipliMetod());
    }
}
