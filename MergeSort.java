
public class MergeSort{

   long count = 0;

    long getCount() {
        return count;
    }
    void sort(int[] intArray, int first, int last) {
        int mid = (first + last)/2;
        int max = intArray.length;
        if( last > first){

            sort(intArray, first, mid);
            sort(intArray, mid + 1, last);
        }

        merge(intArray, first, mid , last, max);
    }

   void merge(int[] intArray, int first, int mid, int last, int max) {


        int[] temp = new int[max];
        int index = first;
        int leftFirst = first;
        int leftLast = mid;

        while((first <= leftLast) && (mid+1 <= last)) {


             count++;
            if (intArray[first] < intArray[mid + 1]) {

                temp[index] = intArray[first];
                first++;
            }
            else {
                temp[index] = intArray[mid + 1];
                mid++;
            }
            index++;
        }

        while(first <= leftLast) {
            temp[index] = intArray[first];
            first++;
            index++;
        }

        while(mid+1 <= last) {
            temp[index] = intArray[mid + 1];
            mid++;
            index++;
        }

        for(int i = leftFirst; i <= last; i++) {
            intArray[i] = temp[i];
        }

    }


    }
