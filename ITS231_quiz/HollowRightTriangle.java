package ITS231_quiz;
public class HollowRightTriangle {
    private static void printhollowRightTriangle (int n) {
        for (int i=1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print(j);
            }
            else {
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printhollowRightTriangle(5);
    }
}
