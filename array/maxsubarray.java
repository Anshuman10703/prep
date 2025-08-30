class maxsubarray{
public static void subarray(int numbers[]){
int currsum = 0;
int maxsum= Integer.MIN_VALUE;
for (int i =0; i< numbers.length; i++){
for (int j =i; j<numbers.length; j++){
currsum=0;
for(int k = i; k<=j; k++){
currsum+= numbers[k];
}
System.out.println(currsum);
if (maxsum<currsum){
maxsum=currsum;
}
}
}
System.out.println("Max Sum =" + maxsum);
}
public static void main(String[]args){
int numbers[] = {2,42,131,1332,134434,2432455};
subarray(numbers);
}
}