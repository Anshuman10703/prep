class slargest{
public static int slargest(int nums [] ){
int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for (int num: nums){
if (num> first){
second = first;
first = num;
}
else if( num <first && num> second){
second = num;
}
}
return second;
}
public static void main(String[] args){
int nums [] = {2,6,8,9,76,54,34,343};
int ans = slargest(nums);
System.out.println("Seconf largest number = "+ ans);
}
}