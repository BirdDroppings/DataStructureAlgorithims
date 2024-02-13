public class factorial {

    public static void main(String[] args) {
        int fact2 = factoral(5);

        System.out.println(fact2);
    }

    public static int factoral(int n){
        if(n == 0){
            return 1;
        } else {
            return n *factorial(n-1);
        }
    }

}