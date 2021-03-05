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
public class OverLoadMetodlar {
    public void adiMetod() {
        System.out.println("Salam Dunya");
    }
    public void adiMetod(int a, int b) {
        
    }
    public void adiMetod(int a) {
        
    }
    public static void main(String [] args) {
        OverLoadMetodlar om=new OverLoadMetodlar();
        om.adiMetod();
        om.adiMetod(55);
    }
}
