/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.obyekt;

/**
 *
 * @author NUBAR
 */
public class Insan {
    public static void main(String[] args) {
    
    Masin Nubar=new Masin();
    Nubar.name="mercedes";
    Nubar.color="goy";
    Nubar.power=500;
    
    System.out.println("Nubarin masinin adi="+Nubar.name);
    System.out.println("Nubarin masinin rengi="+Nubar.color);
    System.out.println("Nubarin masinin gucu="+Nubar.power);
    
    Nubar.sur();
    Nubar.siqnalver();
    Nubar.dur();
    
        Masin leman=new Masin() ;
        System.out.println("lemanin masinin rengi="+leman.color);
        System.out.println("lemanin masinin adi="+leman.name);
        
}
}
