import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Main {

    private static final int length = 10000;
   private static ArrayList<Long>exbubble= new ArrayList<>();
    private static ArrayList<Long>exinsert= new ArrayList<>();
    private static ArrayList<Long>exselect= new ArrayList<>();
    private static ArrayList<Long>exheap= new ArrayList<>();
    private static ArrayList<Long>exquick= new ArrayList<>();
    private static ArrayList<Long>exmerge= new ArrayList<>();
    private static ArrayList<Long>exQuickRandom= new ArrayList<>();
    private static ArrayList<Integer>inputsize= new ArrayList<>();




    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter Array Size:");
        //arraySize = input.nextInt();
        Random rd = new Random();
        int arraySize = 0;

        for (int j = 0; j <= length; j += 1000) {
            System.out.println("Input Size: "+arraySize);
            int[] arr = new int[arraySize];
            inputsize.add(arraySize);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rd.nextInt(); // storing random integers in an array
            }
            int arrayTemp[]= new int[arraySize];
            System.arraycopy(arr,0,arrayTemp,0,arraySize);
           // System.out.println(Arrays.toString(arr));// printing array elements
            SelectionSort ob = new SelectionSort();
            long select= ob.sort(arrayTemp);
            exselect.add(select);
            System.arraycopy(arr,0,arrayTemp,0,arraySize);

            //System.out.println(Arrays.toString(arr));// printing array elements
            BubbleSort bubble = new BubbleSort();
           long bubblesort=bubble.bubbleSort(arrayTemp);
           exbubble.add(bubblesort);
            System.arraycopy(arr,0,arrayTemp,0,arraySize);

            //System.out.println(Arrays.toString(arr));// printing array elements

            HeapSort heap = new HeapSort();
            long heapsort=heap.sort(arrayTemp);
            exheap.add(heapsort);
            System.arraycopy(arr,0,arrayTemp,0,arraySize);

            MergeSort merge= new MergeSort();
           // merge.sort(arrayTemp, 0, arrayTemp.length - 1);
          long executemerge=  merge.excution(arrayTemp, 0, arrayTemp.length - 1);
          exmerge.add(executemerge);
            System.arraycopy(arr,0,arrayTemp,0,arraySize);
            System.out.println(Arrays.toString(arrayTemp));
            QuickSort quick = new QuickSort();
           // quick.sort(arrayTemp, 0, arrayTemp.length - 1);
           long executequick= quick.excution(arrayTemp, 0, arrayTemp.length -1);
           exquick.add(executequick);
            System.arraycopy(arr,0,arrayTemp,0,arraySize);
            System.out.println(Arrays.toString(arrayTemp));
            InsertionSort insert = new InsertionSort();
            long ins=insert.sort(arrayTemp);
            exinsert.add(ins);
            System.arraycopy(arr,0,arrayTemp,0,arraySize);

            System.out.println("Sorted array is");
            System.out.println(Arrays.toString(arrayTemp)); // printing array elements
            arraySize+=1000;


        }
    System.out.print("Input size:");
    System.out.println(Arrays.toString(inputsize.toArray()));
    System.out.print("Bubble Sort:");
    System.out.println(Arrays.toString(exbubble.toArray()));
    System.out.print("Insertion Sort:");
    System.out.println(Arrays.toString(exinsert.toArray()));
    System.out.print("Merge Sort:");
    System.out.println(Arrays.toString(exmerge.toArray()));
    System.out.print("Quick Sort: ");
    System.out.println(Arrays.toString(exquick.toArray()));
    System.out.print("Heap Sort: ");
    System.out.println(Arrays.toString(exheap.toArray()));
    System.out.print("Selection Sort: ");
    System.out.println(Arrays.toString(exselect.toArray()));


    }
}
