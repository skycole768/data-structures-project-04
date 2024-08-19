public class SelectionSort{


    long count;

    long getCount() {
        return count;
    }

     void sort(int[] intArray) {
       int max =  intArray.length;
       int arrayMin = 0;
       int minIndex = 0;

       for (int i = 0; i < max - 1; i++) {
           minIndex = i;
           arrayMin = intArray[i];

           for (int j = i + 1; j <  max; j++) {

               count++;
           if(arrayMin > intArray[j]) {
               arrayMin = intArray[j];
               minIndex = j;
           }

           }
           intArray[minIndex] = intArray[i];
           intArray[i] = arrayMin;
       }
       System.out.println();
       System.out.println(count);

    }


}
