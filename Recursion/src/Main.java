public class Main {

    public static void main(String[] args) {

        System.out.print(recursiveFactorial(5));
    }


    public static int recursiveFactorial(int n){
        if(n==0)
            return 1;

        return n * recursiveFactorial(n-1);

    }
}
