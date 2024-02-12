/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinklist;

/**
 *
 * @author dmoc2
 */
public class DLList implements Interface {

   private Node head, last, curr;
   private int size;

    public DLList() {
        size = 0;
        head = null;
        last = null;
        curr = null;
    }
    
    @Override
    public boolean isEmpty(){
        return (size ==0);
    }
    
    @Override
    public int size(){
        return size;
    }
    
    //private method to arrive at given index 
    private void setCurrent(){
        
    }
    
    
    @Override
    public void add(int index, Object element){
        
    }
   
   

    
}
