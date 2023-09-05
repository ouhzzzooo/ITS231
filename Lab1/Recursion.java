package Lab1;
import java.lang.Math;

public class Recursion {

static int subsum(int n) {
		//Ex1. Complete the content of this method 
          if (n == 0){
               return 0;
          }
          else {
               int num = (int) ((Math.pow(-1, n+1))*n);
               n -= 1;
               return num + subsum(n);
          }
    }
    
static int sumDigit(int n) {
		//Ex2. Complete the content of this method 
          if (n == 0){
               return 0;
          }
          else {
               int k = n % 10;
               return k + sumDigit(n/10);
          }
       
        
    }
    
	public static void main(String[] args) {

            // Test Uncomment these lines below to test your subsum code
                
          System.out.println("Calculating subsum(10):");
          System.out.println("Your answer is "+subsum(10));
          System.out.println("The correct answer is -5");
          System.out.println("-----------------------"); 
              

            // Uncomment these lines below to test your sumDigit code
            
          System.out.println("sumDigit(123456789)");
          System.out.println("Your answer is "+ sumDigit(123456789));
          System.out.println("The correct answer is 45");
            
	}
    
}   
//ex1
// int num_odd = 0;
// int num_even = 0;
// for (int i = 1; i <= n; i++){
//      if (i%2 != 0){
//           num_odd += i;
//      }
//      else{
//           num_even -= i;
//      }
// }
// int sum = num_even + num_odd;
// return sum;