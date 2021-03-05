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
public class Mashin {
    String ad="mercedes";
    int power=500;
    String color="ag";
    
    public Mashin (String ad, int power, String color){
        this.ad=ad;
        this.power=power;
        this.color=color;
    }
    public Mashin(){
        
    }
    public Mashin(int power, String color){
        this.power=power;
        this.color=color;
    }
}
