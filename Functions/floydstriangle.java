class floydstriangle{
public static void floyd(int x){
int counter = 1;
for (int i =1; i<=x; i++){
for (int j = 1; j<=i; j++ ){
System.out.print(counter+ " ");
counter++;
}
System.out.println();
}
}
public static void main(String[] args){
floyd(5);
}
}