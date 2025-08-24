class getlargest{
public static int getlargest(int numbers[]){
int largest = Integer.MIN_VALUE;
for (int i =0; i<numbers.length; i++){
if (largest < numbers[i] ){
largest =numbers [i];
}
}
return largest;
}
public static int getsmallest(int numbers[]){
int smallest = Integer.MAX_VALUE;
for (int i =0; i<numbers.length; i++){
if (smallest> numbers [i]){
smallest = numbers [i];
}
}

return smallest;
}
public static void main(String[]args){
int numbers[]= {1,34,55,666,4354,33553};
System.out.println("Largest number is :"+ getlargest(numbers));
System.out.println("Smallest number is :" + getsmallest(numbers));
}
}
