/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author dmoc2
 */
public class QueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       QueueInterface test = new MyQueue();
       
        System.out.println(test.isEmpty());
        test.enqueue("Mario");
        System.out.println(test.isEmpty());
        System.out.println(test.size());
        System.out.println(test.display());
        
        
    }
    
}
