package az.exercises1;

import java.util.Scanner;

/**
 *
 * @author NUBAR
 */
public class Fesiller {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int ay=input.nextInt();
       if(ay>=3 && ay<=5){
           System.out.println("yaz fesl1i...");
       } else if(ay>5 && ay<=8){
           System.out.println("yay fesli...");
       }else if(ay>8 && ay<=11){
           System.out.println("payiz fesli...");
       }else if(ay==12 || ay<=2){
           System.out.println("qish fesli...");
       }else{
           System.out.println("bu aya uygun fesil tapilmadi...");
       }
    }
}
