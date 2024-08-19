
public class HeapSort{

  long count = 0;

    long getCount() {
        return count;
    }

    void sort(int[] intArray, int num) {
        int index;

        for(int i = num/2 -1; i >= 0; i--) {
            reheapDown(intArray, i, num - 1);
        }

        for(index = num - 1; index >= 1; index--) {
            int temp = intArray[index];
            intArray[index] = intArray[0];
            intArray[0] = temp;
            reheapDown(intArray, 0, index - 1);
        }
    }

    void reheapDown(int[] intArray, int root, int bottom) {

        int maxChild ;
        int rightChild ;
        int leftChild ;
        leftChild = root * 2 + 1 ;
        rightChild = root * 2 + 2 ;

//        count++;
        if (leftChild <= bottom)
        {

//            count++;
            if (leftChild == bottom)
                maxChild = leftChild;
            else
            {
                count++;
                if (intArray[leftChild] <= intArray[rightChild])
                    maxChild = rightChild ;
                else
                    maxChild = leftChild ;
            }
            count++;
            if (intArray[root] < intArray[maxChild])
            {

                int temp = intArray[maxChild];
                intArray[maxChild] = intArray[root];
                intArray[root] = temp;
                reheapDown(intArray, maxChild, bottom);
            }
        }
    }

}
