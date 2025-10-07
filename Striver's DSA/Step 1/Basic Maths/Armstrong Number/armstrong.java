import java.util.*;

        class Main{ 
             public static boolean isArmstrong(int num){
                  int numofdigit = String.valueOf(num).length();
                  int sum = 0; 
                  int n = num;
                        while(n>0) {
                            int digit = n%10;
                            sum+= Math.pow(digit , numofdigit);
                             n = n/10;
                  }
                    return sum==num;
           }
             public static void main(String [] args){
                    int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
            
                                