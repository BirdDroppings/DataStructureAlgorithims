/**
 * LinkedList
 */
import java.util.LinkedList;
public class Main {

    LinkedList<String> linkedList = new LinkedList<String>();

    public Main()
    {
        /* stack 

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        
         */

         //queue list properties
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        //linked list properties
        linkedList.add(4, "E");
        linkedList.remove("E");
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.linkedList);
    }

}