import java.util.*;

//Kareena 19105112
/*Create class Number with only one private instance variable as a double primitive
type. To include the following methods isZero( ), isPositive(), isNegative( ), isOdd( ),
isEven( ), isPrime(), isAmstrong() the above methods return boolean primitive type.
getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above methods return
double primitive type. void listFactor(), void dispBinary(). */

class Number {
    private double double_number;
  
    public Number(double d) {
      double_number = d;
    }
  
    public boolean isZero() {
      if (double_number == 0.0)
        return true;
      else
        return false;
    }
  
    public boolean isPositive() {
      if (double_number > 0.0)
        return true;
      else
        return false;
    }
  
    public boolean isNegative() {
      if (double_number < 0.0)
        return true;
      else
        return false;
    }
  
    public boolean isodd() {
      if (double_number % 2 != 0.0)
        return true;
      else
        return false;
    }
  
    public boolean isEven() {
      if (double_number % 2 == 0.0)
        return true;
      else
        return false;
    }
  
    public boolean isPrime(int n) {
      if (n <= 1)
        return false;
  
      // Check from 2 to square root of n
      for (int i = 2; i <= Math.sqrt(n); i++)
        if (n % i == 0)
          return false;
  
      return true;
    }
  
    public boolean isAmstrong() {
      if (double_number == 0.0)
        return true;
      else
        return false;
    }
  
    public int sumDigits(int n) {
      int sum = 0;
      while (n != 0) {
        sum = sum + n % 10;
        n = n / 10;
      }
      return sum;
    }
  
    public int getReverse(int num) {
      int reverse_num = 0;
      while (num > 0) {
        reverse_num = reverse_num * 10 + num % 10;
        num = num / 10;
      }
      return reverse_num;
    }
  
    public double getSqr() {
      double d = double_number * double_number;
      return d;
    }
  
    public double getSqrt() {
      double d = Math.sqrt(double_number);
      return d;
    }
  
    public void dispBinary(int n) {
      System.out.println("dispBinary :" + Integer.toBinaryString(n));
    }
  
    public int getFactorial(int num) {
  
      return (num == 1 || num == 0) ? 1 : num * getFactorial(num - 1);
  
    }
}
public class q3 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number : ");
      double double_number = sc.nextDouble();

      Number input = new Number(double_number);
      int num = (int) double_number;
      System.out.println("isZero : " + input.isZero());
      System.out.println("isPositive : " + input.isPositive());
      System.out.println("isNegative : " + input.isNegative());
      System.out.println("isOdd : " + input.isodd());
      System.out.println("isEven : " + input.isEven());
      System.out.println("isPrime : " + input.isPrime(num));
      System.out.println("getFactorial : " + input.getFactorial(num));
      System.out.println("getSqrt : " + input.getSqrt());
      System.out.println("getSqr : " + input.getSqr());
      System.out.println("sumDigits : " + input.sumDigits(num));
      System.out.println("getReverse : " + input.getReverse(num));
      input.dispBinary(num);
      System.out.println("isPrime : " + input.isPrime(num));
  
      sc.close();
    }
  }