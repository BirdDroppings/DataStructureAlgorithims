import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
    public void mergeSort(int start, int end)
    {
        int mid;
        if(start < end)
        {
            mid = (start+end)/2; //get the mid point from the current start and end
            mergeSort(start, mid); //first part of the array sorted by a recursive call
            mergeSort(mid+1, end); // 2nd part of the array sorted by a recursive call
            merge(start, mid, end); //merges the array s1 (start to mid) with s2 (mid to end)
        }
    } //end class

    public void merge(int left, int middle, int right)
    {
        int i = left;
        int j = middle+1;
        int k=0; //index of tempArr

        ArrayList <E> tempArr = new ArrayList<>();


        while (i <= middle && j <= right) {
            if (((Comparable)get(i)).compareTo((Comparable)get(j)) <0) { //compare and <0 smaller than
                tempArr.add(k,get(i));
                i++;
            } else {
                tempArr.add(k, get(j));
                j++;
            }
            k++;
        }

        while (i<= middle) { //items in 1st half to be copied 
            tempArr.add(k, get(i));
            k++;
            i++;
            
        }
        while (j <= right) { //items in 2nd half to be copied
            tempArr.add(k, get(j));
            k++;
            j++;
        }

        for(i=left, k=0; i<=right; i++, k++)
        {
            set(i, (E)tempArr.get(k));
        }

    }
    
}
