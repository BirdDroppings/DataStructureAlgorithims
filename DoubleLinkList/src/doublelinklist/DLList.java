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
    private void setCurrent(int index){
        curr = head;
        for(int i =1; i < index; i++)
        {
            System.out.println("Current "+curr.getElement());
           // curr.getNext();
        }
    }
    
    
    @Override
    public void add(int index, Object element){
        //adding newNode to an empty list
        //adding at index of 1
        //adding at a given index
        if(isEmpty())
        {
            Node newNode = new Node(element, null, null);
            head = newNode;
            last = newNode;
            // last = head; //other option
        } else {
            if(index == 1)
            {
             Node newNode = new Node(element, null, null);
             newNode.setNext(head);
             head.setPrev(newNode);
             head = newNode;
            } else { //add at a given index
                setCurrent(index);
                Node newNode = new Node(element, null, null);
                //setting up our ref links 
                newNode.setNext(curr);
                Node prev = curr.getPrev(); // incorporating newNode
                newNode.setPrev(prev); // incorporating newNode
            }
        }
        size++; //manually manage the size!!
    }//end method
    
    @Override
    public Object get(int index){
        setCurrent(index);
        return curr;
    }
    
    @Override
    public void printList()
    {
       /* Node aNode = head;
        for(int i =0; i < size(); i++){
            System.out.println(aNode.getElement());
            aNode = aNode.getNext();
        }   */
        
        for(Node aNode = head; aNode != null; aNode = aNode = aNode.getNext()){
            System.out.println(aNode.getElement());
        }
    }
    
    
    
   
   

    
}
