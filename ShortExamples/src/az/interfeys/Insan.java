/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.interfeys;

/**
 *
 * @author NUBAR
 */
public class Insan implements Canlilar {

    @Override
    public void qidalanir() {
        
        System.out.println("Insan qidalanir...");
    }

    @Override
    public void yasayir() {
        
        System.out.println("Insan yasayir...");
    }

    @Override
    public void nefesAlir() {
        
        System.out.println("Insan nefes alir...");
    }

    @Override
    public void yeriyir() {
        System.out.println("Insan yeriyir...");
    }

    @Override
    public void ucur() {
        System.out.println("Insan uca bilmir...");
    }
    
}
