public class MergeSortApp {
    public static void main(String[] args) {
        MyArrayList<Integer> newArr = new MyArrayList<>();

        newArr.add(50);
        newArr.add(343);
        newArr.add(34);
        newArr.add(55);
        newArr.add(11);
        newArr.add(99);
        newArr.add(1000);
        newArr.add(88);
        newArr.add(1);
        newArr.add(0);
        newArr.add(88);
        newArr.add(4);
        newArr.add(505);
        newArr.add(404);
        newArr.add(320);
        newArr.add(90);
        newArr.add(68);
        newArr.add(456);
        newArr.add(890);
        newArr.add(654);
        newArr.add(333);
        newArr.add(122);
        newArr.add(78);
        newArr.add(98);
        newArr.add(761);

        System.out.println("Elements: "+newArr.toString());
        newArr.mergeSort(0, newArr.size()-1);
        System.out.println("Elements after sort: "+newArr.toString());

    }
}
