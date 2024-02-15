/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinklist;

/**
 *
 * @author dmoc2
 */
public class SingleLinkListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SL s = new SL();
        s.add("nodey");
        s.add( 2, "noley");
        s.add(3, "Dunes");
        System.out.println("empty? "+s.isEmpty());
        System.out.println("size: "+s.size());
        s.print();
    }
    
}
