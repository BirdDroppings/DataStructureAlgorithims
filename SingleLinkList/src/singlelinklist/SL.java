/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlelinklist;

/**
 *
 * @author dmoc2
 */
public class SL implements Interface {
    
    private Node head, curr, prev;
    private int size;

    public SL() {
        size =0;
        head = null;
        curr = prev = null;
    }
    
    @Override
    public boolean isEmpty()
    {
        if(size == 0){
            return true;
        } else 
            return false;
    }
    
    @Override
    public int size(){
        return size;
    }
    
    @Override
    public Object get(int index)
    {
        setCurrent(index);
        return curr;
    }
    
    @Override
    public void remove(int index)
    {
        if(index == 1)
        {
            head = head.getNext();
        } else {
            setCurrent(index);
            prev.setNext(curr.getNext());
        }
        size--;
    }
    
    @Override
    public void add(int index, Object item)
    {
        if(index == 1){
            Node newNode = new Node(item, head);
            head = newNode;
        } else {
            setCurrent(index);
            Node newNode = new Node(item, curr);
            prev.setNext(newNode);
        }
        size++;
    }
    
    private void setCurrent(int index)
    {
        curr = head;
        prev = null;
        for(int i=1; i < index; i++) //do not set the int as 0
        {
            prev = curr;
            curr = curr.getNext();
        }
    }//end method
    
    @Override
    public void add(Object item){
        Node newNode = new Node(item, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(size);
            curr.setItem(size);
        }
        size++;
    }
    
    @Override
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.toString());
            temp = temp.getNext();
        }
    }
    
}
