public class InsertionSort {
    public InsertionSort() {
    }

    long sort(int[] arr) {
        int n = arr.length;
        long startTime = System.nanoTime();

        for(int i = 1; i < n; ++i) {
            int key = arr[i];

            int j;
            for(j = i - 1; j >= 0 && arr[j] > key; --j) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("execution time insertion : " + totalTime);
        return totalTime;
    }

    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
}
