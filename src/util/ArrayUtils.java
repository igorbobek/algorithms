package util;

import java.util.Random;

public class ArrayUtils {

    public static int[] generateArray(int size, int minNumber, int maxNumber){
        int[] result = new int[size];
        Random random = new Random();

        for(int i = 0; i < size; i++){
            result[i] = minNumber + random.nextInt(maxNumber - minNumber + 1);
        }

        return result;
    }

}
