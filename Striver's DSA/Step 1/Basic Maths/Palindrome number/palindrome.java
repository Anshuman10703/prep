import java.util.*;
        
         class Main{
                public static boolean palindrome(int n){
                        int org = n;
                          int rev = 0;
                           int digit =0;
                               while(n>0){
                                   digit = n%10; 
                                    rev = (rev*10)+ digit;
                                     n = n/10;
                                }
                                    return rev == org;
                   }
                     public static void main (String [] args){
                           int n = 23432;
                            boolean result= palindrome(n); 
                            System.out.println(result);
                     }
            }

                                
                                    
                       