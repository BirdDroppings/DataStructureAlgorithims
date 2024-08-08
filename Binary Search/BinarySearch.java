/**
 * BinarySearch
 */
public class BinarySearch {
   
    public static void main(String[] args) {
        
        int[] array = {1 ,2 ,4 ,5 ,7 , 9 ,11};

        
        System.out.println(binarySearch(array, 11));

    }
        
        
        
       
    
    private static int binarySearch(int[] numbers, int numToFind)
    {
        int low = 0;
        int high = numbers.length-1;

        while(low <= high)
        {
            int middlePos = (low+high) /2;
            int middleNum = numbers[middlePos];

            if(numToFind == middleNum)
            {
                return middlePos;
            }

            if (numToFind < middleNum) {
                high = middlePos -1;                
            } else {
                low = middlePos +1;
            }
        }

        return -1;

    }

}