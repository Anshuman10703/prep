import java.util.*;

  class Main{
       public static int countDigits(int n){
           
            int count = 0;
             
         while( n > 0){
            count = count+1 ;
            n = n/10 ;
         }
            return count ;
       }
     
      public static void main(String [] args) {

       int N = 329823;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}  
           
            