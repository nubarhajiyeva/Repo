package az.string_metod;

/**
 *
 * @author NUBAR
 */
public class StringMetodu {
    public static void main(String[] args) {
//mesele 1
      String s="Javac";
      System.out.println(s.substring(0, (s.length()-1)));
//mesele2
      String z="835896";
      System.out.println(z.replace("8","6").substring(0,z.length()-1)+z.substring(0,1));
//mesele3
    String j="Java" ,a="";
    //char b='*';
    for(int i=0;i<j.length(); i++){
        a+=j.charAt(i)+"*";
    }
    System.out.println(a.substring(0, a.length()-1));
//  mesele4
    String m="salam azerbaycan respublikasinin prezidenti cenab ilham eliyev";
    String massiv[]=m.split(" ");
    m = "";
    for (String c:massiv){
       m+=c.substring(0, 1).toUpperCase()+c.substring(1)+" ";
     }
        System.out.println(m);
    }
}