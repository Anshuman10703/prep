import java.util.*;
          
           class Main{
                  public static int GCD(int a, int b){
                            while(b!=0){
                                   int temp = b;
                                    b= a%b;
                                    a = temp;
                             }
                                return a;
                  }
                    public static void main(String [] args){
                                  int a =10;
                                  int b =25;
                                  int gcd = GCD(a , b);
                                System.out.println(gcd);
                    }
            }