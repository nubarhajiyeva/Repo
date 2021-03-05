/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.varislik;

/**
 *
 * @author NUBAR
 */
public class Infinity extends Masin{
    public static void main(String[] args) {
        Infinity infinity =new Infinity();
        infinity.setGuc(900);
        System.out.println(infinity.getGuc());
        infinity.setReng("qirmizi");
        System.out.println(infinity.getReng());
    }
}
