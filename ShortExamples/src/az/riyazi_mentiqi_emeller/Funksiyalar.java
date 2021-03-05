/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.riyazi_mentiqi_emeller;

/**
 *
 * @author NUBAR
 */
public class Funksiyalar {
    public static void main (String[] arg){
        double x=1;
        System.out.println("f="+(Math.pow((x+2), 2)+8*(Math.pow((x+2), 3))));
        System.out.println("f="+(3*(x+2)+Math.pow((x+2), 3)));
        System.out.println("f="+(4*x*x*(Math.pow(x,3)+1)));
        System.out.println("f="+(x*x/2+(Math.pow(x,2)/2)+5));
        System.out.println("f="+(5*(Math.pow(x, 3))+2*(Math.pow(x, 2)+3)));
        System.out.println("f="+(Math.pow(x,2)*((Math.pow(x,3))+1)));
        System.out.println("f="+((x+1)/2+Math.pow((x+1), 3)));
        System.out.println("f="+(x/2+Math.pow((x+2), 2)));
        System.out.println("f="+(10*Math.pow(x,2)/2*(Math.pow(x,2)+x)));
        System.out.println("f="+((Math.pow(x,2))+(Math.pow(x, 3)*9)));
        System.out.println("f="+(Math.pow((x+1),2)/(Math.pow((x+2),3))));
        x*=(2*((Math.pow(x,3))+1))/(Math.pow((x+2),2));
        System.out.println("f="+x);
        
    }
}
