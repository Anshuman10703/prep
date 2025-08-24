import java.util.*;
class even {
public static void isEven(int n){
if (n%2 == 0){
System.out.print("true");
}
else{ 
System.out.print("false");
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
isEven(n);
}
}