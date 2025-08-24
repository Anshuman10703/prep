class binomialcoff{

  public static int factorial(int n){
   int f=1;
   for(int i =1; i<=n; i++){
   f=f*i;
}
   return f;
}
  public static int bincoff(int n , int r){
   int n_fact= factorial(n);
   int r_fact= factorial(r);
   int nmrfact= factorial(n-r);
   int binom = n_fact/(r_fact * nmrfact );
   return binom;
}
  public static void main(String[]args){
   System.out.println(bincoff(5 , 2));
}
}
   
 
  