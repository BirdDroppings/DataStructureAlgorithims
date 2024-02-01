/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package queue;

/**
 *
 * @author dmoc2
 */
public interface QueueInterface {
    
    public int size();
    public boolean isEmpty();
    public void enqueue(Object newItem);
    public Object dequeue();
    public Object frontElement();
    public String display();   
    public Object removeAll();
    
}
