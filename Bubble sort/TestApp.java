import java.util.Arrays;

public class TestApp {

    public static void main(String[] args) {
        
        MyArrayList<Integer> list1 = new MyArrayList<Integer>();
        list1.add(7);
        list1.add(90);
        list1.add(2);
        list1.add(4);
        list1.add(33);
        list1.add(58);

        System.out.println(list1);

        list1.betterBubble();
        System.out.println("After sort: "+list1);
        
        
        //add unsorted items to your arraylist, print list 1
        //sort using the better bubble method and then print list 1 again to ensure it is 

    }
}