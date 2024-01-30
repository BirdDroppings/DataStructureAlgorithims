/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dmoc2
 */
public class MyQueue implements QueueInterface {
    
       private ArrayList<String> qlist;
//  declaration
 
    public MyQueue() {
        qlist = new ArrayList<>();
//      creation of objects
    }
    @Override
    public int size(){
        return qlist.size();
    } 
    @Override
    public boolean isEmpty(){
        return qlist.isEmpty();
    }
    @Override
    public void enqueue(Object newItem){
        qlist.add((String)newItem);
//      cast the object accepted to a String in line with thte qlist
    } 
    
    
    @Override
    public Object dequeue()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return null;
        } else {
            return qlist.remove(0);
        }
    }
    
    @Override 
    public Object frontElement()
    {
        if(isEmpty())
        {
            System.out.println("it is empty");
            return null;
        } else {
            return qlist.get(0);
        }
    }
    
    
    @Override
    public String display()
    {
        String str = "";
        if(isEmpty())
        {
            System.out.println("There is nothing to display");
            return null;
        } else {
            Iterator it;
            it = qlist.iterator();
            
            while(it.hasNext()){
              str = str.concat((String)it.next())  ;
              str = str.concat("; ");
            }
            
        }
        return str;
    }
    
}
