/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stack;

/**
 *
 * @author dmoc2
 */
public interface StackInterface {
    
    //essential
    public void push(Object newItem);
    public Object pop();
    public Object peek();
    public boolean isEmpty();
   
    //less essential
    public int size();
    public int display();
    
    
}
