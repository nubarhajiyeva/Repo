import java.util.Scanner;
//package az.exercises;
public class Tapsiriq {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int ay=input.nextInt();
        //for(ay=0; ay<=12; ay=ay+1){ 
        if(ay>=3 && ay<=5 ){
            
        System.out.println("yaz fesli...");
        } else if(ay>5 && ay<=8){
        System.out.println("yay fesli...");
        } else if(ay>8 && ay<=11){     
        System.out.println("payiz fesli...");
        }else if(ay==12 && ay<=2){
        System.out.println("qish fesli...");
        }else{     
        System.out.println("bele fesil movcud deyil...");
        
    }
}
}