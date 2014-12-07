package gold.programming.ga;

import java.util.Random;

/**
 * Created by Mike on 12/6/2014.
 */
public class Keygen {
    public static void main(String[] args) {
        Random random = new Random();
        for (int count = 0; count <= Integer.parseInt(args[0]); count++) {
            System.out.print(random.hashCode());
        }
}   }
