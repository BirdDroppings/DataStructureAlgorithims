/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinklist;

/**
 *
 * @author dmoc2
 */
public class DoubleLinkListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DLList dl = new DLList();
        
        System.out.println("Empty? "+dl.isEmpty());
        dl.add(1, "Yolo");
        dl.add(2, "Haris");
        dl.add(3, "Elise");
        
        System.out.println("Size "+dl.size());
        dl.printList();
        dl.add(1, "Rachel");
        dl.printList();
        
    }
    
}
