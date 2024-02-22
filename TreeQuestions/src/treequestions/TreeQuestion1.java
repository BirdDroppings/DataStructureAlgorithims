/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treequestions;

/**
 *
 * @author dmoc2
 */
public class TreeQuestion1 {
    // Fill in the blank of these methods
    private int element;
    private TreeQuestion1 leftChild;
    private TreeQuestion1 rightChild;
    
    public TreeQuestion1(int theValue){
        element = theValue;
        leftChild = null;
        rightChild = null;
    }
    
    public boolean isLeaf()
    {
        
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public TreeQuestion1 getLeft() {
        return leftChild;
    }

    public void setLeft(TreeQuestion1 theNode) {
        this.leftChild = theNode ;
    }

    public TreeQuestion1 getRight() {
        return rightChild;
    }

    public void setRightChild(TreeQuestion1 theNode) {
        this.rightChild = theNode;
    }
    
    public boolean isInteral()
    {
        
    }
    
    
    public boolean isExternal()
    {
          if((leftChild == null) && (rightChild == null))
            return true;
        else
            return false;
    }
    
    
}
