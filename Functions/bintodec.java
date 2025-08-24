import java.util.*;
 class bintodec{
 public static void bintodec(int n){
int pow =0;
int mynum = n;
int dec = 0;
while (n>0){
int lastDigit= n%10;
dec= dec + (lastDigit* (int)Math.pow(2, pow));
pow++;
n= n/10;
}
System.out.println("decimal of"+ mynum +"="+ dec);
}
public static void main(String [] args){
bintodec(101);
}
}
