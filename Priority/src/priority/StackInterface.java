/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package priority;

/**
 *
 * @author dmoc2
 */
public interface StackInterface {
    
    public void enqueue(int pk, Object element); //pk is priority key
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public Object frontElement();
    public String displayQ();
    
    
    
    
    
    
}
