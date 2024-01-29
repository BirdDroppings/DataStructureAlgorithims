/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author dmoc2
 */
public class StackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StackInterface load = new MyStack();
        
        System.out.println("empty? "+ load.isEmpty());
        System.out.println("add some blocks");
        load.push(5);
        
        System.out.println("is empty?"+load.isEmpty());
        System.out.println("peek? "+load.peek());
        load.push(1);
        System.out.println("peek? "+load.peek());
        load.push(2);
        System.out.println("peek? "+load.peek());
        System.out.println("time to pop off");
        load.pop();
         System.out.println("peek? "+load.peek());
         System.out.println("display: "+load.display());
        
    }
    
}
