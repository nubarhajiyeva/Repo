/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.enkapsulyasiya;

/**
 *
 * @author NUBAR
 */
public class Enkapsulyasiya {
    public static void main(String[] args) {
        Masin masin=new Masin();
        masin.setColor("ag");
        System.out.println(masin.getColor());
        masin.setPower(650);
        System.out.println(masin.getPower());
        
    }
}
