package diziler;

/**
 *
 * @author soyka
 */
public class Uygulama04 {

    public static void main(String[] args) {
        int sayi[] = {12, 5, 8, 23, 46, 698};
        int eb = sayi[0];// başalngıçta en büyük 
        for (int k = 1; k < sayi.length; k++) {
            if (sayi[k] > eb) {
                eb = sayi[k];
            }
        }
        System.out.println("En büyük = " + eb);
    }
}
