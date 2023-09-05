package ITS231_quiz;
public class SumOfEvenNumbers {
    private static int findResult(int n) {
        int sum = 0;
        int number = 2;
        while (number <= n) {
            if (number % 2 == 0) {
                sum += number;
            }
            number++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findResult(10));
    }
}
