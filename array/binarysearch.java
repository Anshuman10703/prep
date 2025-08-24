class binarysearch{
public static int binarysearch(int numbers[], int key){
int start =0, end= numbers.length-1; 
while(start<= end){
int mid = (start+end)/2;

if(numbers[mid]==key){
return mid;
}
if(numbers[mid]>key){
end = mid-1;
}
else{
start = mid +1;
}
}
return -1;
}
public static void main(String[] args){
int numbers []= {1, 2, 4, 5, 6, 8, 10, 14, 16 };
int key = 10;
System.out.print("key found at index :"+ binarysearch(numbers, key));
}
}
