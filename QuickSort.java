public class QuickSort {
    public QuickSort() {
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        int j;
        for(j = low; j < high; ++j) {
            if (arr[j] <= pivot) {
                ++i;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        j = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = j;
        return i + 1;
    }

    void sort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = this.partition(arr, low, high);
            this.sort(arr, low, pi - 1);
            this.sort(arr, pi + 1, high);
        }

    }

    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public long excution(int[] arr, int l, int r){
        long startTime = System.nanoTime();
        sort(arr,l,r);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("execution time quick : " + totalTime);
        return  totalTime;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, 8, 9, 1, 5};
        int n = arr.length;
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);
        System.out.println("sorted array");
        printArray(arr);
    }
}