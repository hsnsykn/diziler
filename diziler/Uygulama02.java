
package diziler;

/**
 *
 * @author soyka
 */
public class Uygulama02 {
    public static void main(String[] args) {
     int sayi [] = new int [10];
     //atayalım
     for (int k = 0;k <= 10 ;k++){
         sayi [k] = (int)(Math.random()*100)+ 1;
     }
     //yazdıralım
       for (int k = 0;k <= 10 ;k++){
           System.out.println(sayi [k]);
       }
    }
   
}
