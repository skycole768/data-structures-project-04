import java.util.*;
public class QuickSortRE{

    static int count;

    int getCount() {
        return count;
    }

    void sort( int[] intArray, int first, int last)  {

        if ( first < last ) {
            int splitPoint = splitPoint(intArray, first, last);

            sort(intArray, first, splitPoint - 1);
            sort(intArray, splitPoint + 1, last);
        }
    }

    int splitPoint( int[] intArray, int first, int last) {

        Random rand = new Random();
        int pivotPoint = rand.nextInt(last-first)+first;
        int pivot = intArray[pivotPoint];

        int temp1 = intArray[last];
        intArray[pivotPoint] = temp1;
        intArray[last] = pivot;

        int index = first;
        int i = first;


        while(index < last) {

            count++;
            if(intArray[index] < pivot) {
                // i++;
// count++;
                int temp = intArray[i];
                intArray[i] = intArray[index];
                intArray[index] = temp;
                i++;
            }
            index++;
        }

        //count++;
        int temp = intArray[i];
        intArray[i] = intArray[last];
        intArray[last] = temp;

        return i;
    }




}
