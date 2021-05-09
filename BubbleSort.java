public class BubbleSort {
    public BubbleSort() {
    }

    long bubbleSort(int[] arr) {
        long startTime = System.nanoTime();
        for(int i = 0; i < arr.length- 1; ++i) {

            for(int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("execution time bubble: " + totalTime);
        return  totalTime;
    }

    void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int[] arr = new int[]{64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}