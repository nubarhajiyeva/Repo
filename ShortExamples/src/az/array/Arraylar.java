/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.array;

/**
 *
 * @author NUBAR
 */
public class Arraylar {
    public static void main (String[] args){
//       int name[]=new int[3];
//       int hasil=1;
//        for(int i=0; i<name.length; i++) {
//            name[i]=(int) (Math.random()*10);
//            hasil*=name[i];
//            System.out.println(name[i]);
//        }
////        System.out.println(hasil);
        int name[]= new int [6];
            int cem=0;
            for(int i=0; i<name.length; i++) {
                name[i]=(int) (Math.random()*100);
                if(name[i]%2==1) {
                    cem+=name[i]; 
                }
           
                 System.out.println("element="+name[i]);
            }
            System.out.println(cem);
//            int name[]= new int [10];
//            for(int i=0; i<name.length; i++) {
//                name[i]=(int) (Math.random()*100);
//                if(i%2==1 && name[i]%2==0) {
//                    System.out.println("index="+i+" "+"element="+name[i]);
//                }
//            }
      }
}
