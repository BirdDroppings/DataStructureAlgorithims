/*
 * This is blue print class 
 * Author David O'Connor 
 */

import java.util.ArrayList;

import javax.lang.model.element.Element;

public class MyArrayList<ElemType> extends ArrayList<ElemType>{
    
    public void betterBubble(){
        Comparable elemAtJ; //using the comparable interface
        Comparable elmemAtJplus;

        for(int i=0; i < size(); i++){
            for(int j=0; j < size() -1-i; j++){
                elemAtJ = (Comparable)get(j); //getting the items at the required index
                elmemAtJplus = (Comparable)get(j+1); //casting the variables to compare them

                if (elemAtJ.compareTo(elmemAtJplus)> 0) {
                    swap(j, j+1);
                }//end if 
            } //end for loop 2
        }//end for loop 1
    }//end betterBubble

    public void simpleBubble()
    {
        Comparable elemAtJ; //using the comparable interface
        Comparable elmemAtJplus;
        boolean moreSwap = true;
        while ( moreSwap == true) {
            moreSwap = false;
                for(int x=0; x < size()-1; x++){
                    elemAtJ = (Comparable)get(x); //getting the items at the required index
                elmemAtJplus = (Comparable)get(x+1);
                    if (elemAtJ.compareTo(elmemAtJplus) >0) {
                        swap(x, x+1);
                        moreSwap = true;
                    }
                }
        }
    }



    private void swap(int pos1, int pos2){
        //temp holder for elements
        ElemType tempPos1 = get(pos1);
        ElemType tempPos2 = get(pos2);

        
        set(pos1, tempPos2);
        set(pos2, tempPos1);
         
    }
    
}
