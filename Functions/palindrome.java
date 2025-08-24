import java.util.*;
class palindrome{
public static boolean isPalindrome(int n){

int palindrome = n;
int rev = 0;
 
while(n>0){
int lastDigit = n%10;
rev = rev* 10 + lastDigit;
n= n/10;
}
return palindrome == rev;
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number : ");
int n = sc.nextInt();
System.out.println(isPalindrome(n));
sc.close();
}
}
