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
public class MentiqiTipler {
    public static void main(String[] args){
        /*boolean a=true;
        boolean b=false;
        System.out.println("!a&b=" +(!a&b));
        System.out.println("!(a&b=)"+(!(a&b)));
        System.out.println("!a||b="+(!a||b));
        System.out.println("!(a||b)"+(!(a||b)));*/
        double x=14;
        double y=36;
        x*=Math.pow(y, 2);
        System.out.println(x);
        y/=(x+y);
        System.out.println(y);
        x%=y+2;
        System.out.println(x);
        y+=3*x;
        System.out.println(y);
        x-=Math.pow(y,3);
        System.out.println(x);
        
    }
}






