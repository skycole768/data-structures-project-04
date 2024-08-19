public class QuickSortFE{

    static int count;

    int getCount() {
        return count;
    }

    void sort( int[] intArray, int first, int last)  {

        if ( first < last ) {
            //  count++;
            int splitPoint = splitPoint(intArray, first, last);

            sort(intArray, first, splitPoint - 1);
            sort(intArray, splitPoint + 1, last);
        }
    }

    int splitPoint( int[] intArray, int first, int last) {
        int pivot = intArray[first];
        int index = first;
        int end = last;


        while(index < end) {

            count++;
            while( index < last && intArray[index] <= pivot) {
                index++;
                 count++;
            }

            count++;
            while (first < end && intArray[end] > pivot) {
                end--;
                count++;
            }

        if(index < end) {
            int temp = intArray[index];
            intArray[index] = intArray[end];
            intArray[end] = temp;
        }
        }

        int temp = intArray[first];
        intArray[first] = intArray[end];
        intArray[end] = temp;

        return end;
    }




}
