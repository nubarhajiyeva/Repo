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
public class Masin {
    private String reng;
    private int guc;

    public String getReng() {
        return reng;
    }

    public void setReng(String reng) {
        System.out.println("masinin rengi");
        this.reng = reng;
    }

    public int getGuc() {
        System.out.println("masinin gucu");
        return guc;
    }

    public void setGuc(int guc) {
        this.guc = guc;
    }
    public static void main(String[] args){
        Masin masin=new Masin();
    }
    
 }
