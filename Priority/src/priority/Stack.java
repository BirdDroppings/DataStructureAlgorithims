/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priority;

import java.util.ArrayList;

/**
 *
 * @author dmoc2
 */
public class Stack implements StackInterface {
    
    public ArrayList<PQElem> pqList;

    public Stack() {
        pqList = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty()
    {
        return pqList.isEmpty();
    }
    
    @Override
    public int size()
    {
        return pqList.size();
    }
    
    private int findInsertPosition(int newKey){
        PQElem elem;
        int position = 0;
        for(position =0; position < pqList.size(); position++){
            elem = pqList.get(position);
            if(elem.getPriorityKey()< newKey){
                break;
            }
        }
        return position;
    }
    
    
    
    @Override 
    public void enqueue(int pk, Object item){
        //pqList.add(pk, element);
        int index;
        PQElem elem = new PQElem (pk, item);
        index = findInsertPosition(pk);
        
        if(index > size()){
            pqList.add(elem);
        } else {
            pqList.add(index, elem);
        }
        
    }
    
    
    
    
}
