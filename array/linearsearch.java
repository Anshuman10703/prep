import java.util.*;
class linearsearch{
public static int linear(int numbers[], int key){
for (int i =0; i< numbers.length; i++){
if (numbers[i]== key){
return i;
}
}
return -1;
}
public static void main(String[]args){
int numbers[] = {2,4,5,6,8,10,56,443,2354};
int key =10;

int index = linear(numbers ,key);

if(index == -1){
System.out.print("Key is not found");
}
else{
System.out.print("key is found at index :"+ index);
}
}
}

