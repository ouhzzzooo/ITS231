package ITS231_quiz;
public class Factorial {
    private static int findFactorial(int n) {
        int factorial = 1 ;
        while (n >= 1) {
            factorial *= n;
            n -= 1;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        System.out.println(findFactorial(6));
    }
}
