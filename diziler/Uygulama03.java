
package diziler;

/**
 *
 * @author soyka
 */
public class Uygulama03 {
    public static void main(String[] args) {
        int zar [] = new int[6];
        for (int k = 1;k<= 500;k++){
            int z = (int)(Math.random()*6)+ 1;
            zar [z-1] ++;
        }
        for (int  x=0; x <6; x++){
            System.out.println("Zar" + (x + 1) + " :" + zar [x]);
        }
    }
  
}
