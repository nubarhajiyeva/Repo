package az.exercises1;

/**
 *
 * @author NUBAR
 */
public class Tapsiriq2 {
   public static void main(String[] args){
//       int hasil = 1 ;
//       int cem=0;
//        int i = 0;
//      for(i=0;i<tp.length;i++){
//          tp[i]=(int)(Math.random()*100);
//        System.out.println(tp[i]);
//
//       cem=(Math.floorDiv(tp[i], 10)+Math.floorMod(tp[i], 10));
//         System.out.println(cem);
//       hasil=(Math.floorDiv(tp[i], 10)*Math.floorMod(tp[i], 10));
//         System.out.println(hasil);
//      }
      //System.out.println((int)( Math.random()*100));
      int a=(int)( Math.random()*100);
      int hasil;
      int cem;
      System.out.println("eded..."+a);
      int i = Math.floorMod(a,10);
      int j=Math.floorDiv(a, 10);
      hasil=i*j;
      cem=i+j;
      System.out.println("reqemlerinin hasili..."+hasil);
      System.out.println("reqemlerinin cemi..."+cem);
       
        }
   }
