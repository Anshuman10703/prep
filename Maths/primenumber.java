import java.util.*;
public class PrimeNumber {
    
    public static boolean isprime(int n){
        for (int i =2; i<=n-1;i++){
            if (n%i==0){
                return false;
            } 
           
        }
        return true;
    }
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    if (isprime(n)){
        System.out.println(n + " is a prime number.");
    } else {
        System.out.println(n + " is not a prime number.");
    }
}
}