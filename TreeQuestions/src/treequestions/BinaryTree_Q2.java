/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treequestions;

import java.util.HashSet;

/**
 *
 * @author dmoc2
 */
// this will also contain question 3 & 4
public class BinaryTree_Q2 {
    
    public TreeQuestion1 theRoot;

    public BinaryTree_Q2() {
        theRoot = null;
    }
    
    public boolean isEmpty()
    {
         if (theRoot == null)
            return true;
        else
            return false;
    }
    
    // question 2 fill in the gaps
    public void insertNode(TreeQuestion1 startNode, TreeQuestion1 newNode){
      if(theRoot == null){
          theRoot = newNode;
      } else { 
        /* fill in the gap here
          
          
          
          */
      } else {
              insertNode(startNode.getRight(), newNode);
              } else if(//fill in this condition Q4)
                      {
                        if(startNode.getLeft() == null){
                     startNode.setLeft(newNode);
                    
                      } else 
                            insertNode(startNode.getLeft(), newNode);
                      } else if (newNode.getElement() == startNode.getElement()){
                      System.out.println("the node "+startNode.getElement()+"was already inserted");
                      }
      
          
    }
    
    
    
    
}
