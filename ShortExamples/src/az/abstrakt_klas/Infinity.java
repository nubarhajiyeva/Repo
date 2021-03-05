/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.abstrakt_klas;

/**
 *
 * @author NUBAR
 */
public class Infinity extends Masin{

    @Override
    public void sur() {
        System.out.println("Masin sur.....");
        
    }
    public static void main(String[] args) {
       Infinity infinity=new Infinity();
       infinity.dur();
       infinity.sur();
    }
    
}
