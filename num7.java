public class Main{
  public static void main(String[] args){
    int num=123456;
    int product=1;

  while(num>0){
    int rem = num%10;
    product=product*rem;
    num=num/10;
  }
    System.out.print(product);
  }
}
