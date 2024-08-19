import java.util.*;
import java.io.*;
import java.util.Scanner;

class SortDriver{

    static int[] intArray;

    public static void main(String[] args) {



        try {
            String fileName = args[0];
            File file = new File(fileName);

            Scanner fileReader = new Scanner(file);

            //       int length = (int)file.length();
            // System.out.println(length);
            // int[] intArray = new int[length];
            // int num;
            //List<Integer> list = new ArrayList<Integer>();
            int length = 0;
            while(fileReader.hasNextInt()) {
                //  list.add(fileReader.nextInt());
                fileReader.nextInt();
                length++;
            }
            fileReader.close();

            Scanner fileReader2 = new Scanner(file);
            intArray = new int[length];

            for(int i = 0; fileReader2.hasNextInt() == true; i++) {
                intArray[i] = fileReader2.nextInt();
            }
            //      int[] intArray = list.toArray(new int[0]);

            fileReader2.close();
        } catch (IOException | ArrayIndexOutOfBoundsException e) { //if file not foun
            testRandom();
        }


        System.out.println("selection-sort (s) merge-sort (m) heap-sort (h) quick-sort-fp (q)");
        System.out.println("quick-sort-rp (r)");
        System.out.print("Enter the algorithm: ");

        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        switch(input) {
        case "s":
            SelectionSort sel = new SelectionSort();
            sel.sort(intArray);
            printArray();
            System.out.print("#Selection-sort comparisons: ");
            System.out.println(sel.getCount());
            break;
        case "m":
            int start = 0;
            int last = intArray.length - 1;
            MergeSort merge = new MergeSort();
            merge.sort(intArray, start, last);
            printArray();
            System.out.print("#Merge-sort comparisons: ");
            System.out.println(merge.getCount());
            break;
        case "h":
            int num = intArray.length;
            HeapSort heap = new HeapSort();
            heap.sort(intArray, num);
            printArray();
            System.out.print("#Heap-sort comparisons: ");
            System.out.println(heap.getCount());
            break;
        case "q":
            int first = 0;
            int last1 = intArray.length - 1;
            QuickSortFE quick = new QuickSortFE();
            quick.sort(intArray, first, last1);
            printArray();
            System.out.print("#Quick-sort-fp comparisons: ");
            System.out.println(quick.getCount());
            break;
        case "r":
            int first1 = 0;
            int last2 = intArray.length - 1;
            QuickSortRE quickRE = new QuickSortRE();
            quickRE.sort(intArray, first1, last2);
            printArray();
            System.out.print("#Quick-sort-re comparisons: ");
            System.out.println(quickRE.getCount());
            break;
        }
        keyboard.close();
    }

    static void printArray() {
        for (int i = 0; i < intArray.length; i++) {
           System.out.print(intArray[i]);
           System.out.print(" ");
        }
        System.out.println();

    }

    static void testRandom() {
        System.out.print("Enter the size of the input you wish to test: ");
                Scanner keyboard1 = new Scanner(System.in);
        int input1 = keyboard1.nextInt();

        intArray = new int[input1];
        Random rand = new Random();

        for(int i = 0; i < input1; i++) {
           intArray[i] = rand.nextInt(input1);

        }
///        keyboard1.close();
    }
}
