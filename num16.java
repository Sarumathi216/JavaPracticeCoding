public class Main{
  public static void main(String[] args){
    int num=74835;
    int max=0;

  while(num>0){
    int rem=num%10;

    if(rem>max){
      rem=max;
    }
    num=num/10;
  }
  System.out.print(max);
  }
}
