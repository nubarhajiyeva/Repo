/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.metodlar;

/**
 *
 * @author NUBAR
 */
public class ParametliParametrsiz {
    public void parametrliMetod(int a, int b){
        System.out.println("bu parametrli metoddur");
        System.out.println(a+b);
    }
    
    public void parametrsiz() {
        System.out.println("bu parametrsiz metoddur");
    }
    public static void main (String[] args) {
        ParametliParametrsiz pp=new ParametliParametrsiz();
        pp.parametrliMetod(340, 800);
        pp.parametrsiz();
    }
}
