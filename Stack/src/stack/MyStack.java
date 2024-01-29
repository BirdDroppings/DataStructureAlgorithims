/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author dmoc2
 */
public class MyStack implements StackInterface {
    
    private ArrayList<Integer> aStack; 

    public MyStack() {
         aStack = new ArrayList<>();
    }
    
    @Override
    public void push(Object newItem){
        aStack.add(0, (Integer)newItem);
    }
    
    @Override
    public boolean isEmpty()
    {
        return aStack.isEmpty();
    }
    
    @Override 
    public Object pop(){
        if(isEmpty()){
            //if(aStack.isEmpty())
            return null;
        } else {
            return aStack.remove(0);
        }
    }
    
    @Override
    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        } else {
            return aStack.get(0);
        }
        
    }//end peek
    
    
    @Override
    public int size()
    {
        return aStack.size();
    }
    
    @Override
    public int display()
    {
        //display stack from the top of the index
        int str=0;
        if(isEmpty())
        {
            //str = str.concat("The Stack is Empty, no display");
            return 0;
        } else {
          /* for(int i=0; i < aStack.size(); i++){
               str = str.concat(aStack.get(i));
               str = str.concat("; ");
           }
        } */
        Iterator it;
        it = aStack.iterator();
        
        while(it.hasNext())
        { //return true or false if there is a next object or he finds null
            
// str = str.concat((String)it.next());
           //  str = str.concat("; ");
        }
        
        }
        return str;
    }
    
}
