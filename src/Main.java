import by.sorting.MergeSort;
import by.sorting.Sorting;
import util.ArrayUtils;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws Exception{
        int[] a = ArrayUtils.generateArray(7, -10, 10);
        Arrays.stream(a).forEach(e->System.out.print(e+" "));

        long start = System.currentTimeMillis();

        Sorting sorting = new MergeSort();
        sorting.sort(a);

        long end = System.currentTimeMillis();
        System.out.println("\nFinished in: " + (end - start) + " milliseconds.");

        Arrays.stream(a).forEach(e->System.out.print(e+" "));
        a.hashCode();


    }


}
