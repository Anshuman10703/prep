class linear{
public static int linear(int nums[], int num){
for(int i = 0; i<nums.length; i++){
if(nums[i]== num){
return i;
}
}
return -1;
}
public static void main(String[]args){
int [] nums= {1,3,5,7,9,87,57};
int num = 87;
System.out.println("num is at index: " +linear(nums , num));
}
}