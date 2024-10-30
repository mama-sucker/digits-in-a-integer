// Module 6 Excercise 6.2 
// By Addison Roy

//imports 

public class Dia {

    public static void main(String[] args) {
        System.out.println("Sum the digits in an interger");
        testSumDigits(234);      
        testSumDigits(12345);    
        testSumDigits(0);        
        testSumDigits(987654321); 
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10; 
            n /= 10;       
        }

        return sum;
    }

    public static void testSumDigits(long number) {
        int result = sumDigits(number);
        System.out.println("The sum of the digits in " + number + " is " + result);
    }
}
