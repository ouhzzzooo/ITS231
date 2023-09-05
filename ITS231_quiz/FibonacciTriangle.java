package ITS231_quiz;
public class FibonacciTriangle {
    private static void printFibonacciTriangle(int numOfRows) {
        int firstTerm = 0;
        int secondTerm  = 1;
        int nextTerm = 0;
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(firstTerm + " ");
                nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printFibonacciTriangle(5);
    }
}
