import java.util.Arrays;

public class SelectionSort {
    public SelectionSort() {
    }

    long sort(int[] arr) {
        int n = arr.length;
        long startTime = System.nanoTime();
        for(int i = 0; i < n - 1; ++i) {
            int min_idx = i;
            int pass= i+1;
          //  System.out.println("Pass"+pass);
           // System.out.println(Arrays.toString(arr));
            int j;
            for(j = i + 1; j < n; ++j) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                }

            }

            j = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = j;
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("execution time selection: " + totalTime);
        return totalTime;

    }

    void printArray(int[] arr) {
        int n = arr.length;
   System.out.println(Arrays.toString(arr));

       // System.out.println();
    }


}
