public class factorial {
    public static void main(String[] args) {
        repeat();
        recurisiveMe(1);

        int [] data = {1,2,3,10};

        int arraySum = computeSum(data, 0);
        System.out.println(arraySum);


    }


    public static int computeSum(int [] data, int index){
        if(index >= data.length){
            return 0;
        } else {
            return data[index] = computeSum(data, index+1);
        }
    }
/* public static int fibMemo(int [] prevFibs, int n){
        if (prevFibs[n-1] != 0) {
            return prevFibs[n-1];
        } else if (n ==1 || n==2) {
            return 0;
        
    } */
   



    public static int factoral(int n){
        if(n == 0){
            return 1;
        } else {
            return n *factoral(n-1);
        }
    }

    public static void repeat()
    {
        for(int i=0; i < factoral(3); i++){
            System.out.println("*");
        }
    }

    public static void recurisiveMe(int n)
    {
        if(n <= 5){
            System.out.println("*");
            recurisiveMe(n+1);
        }
    }


}
