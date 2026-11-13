public class Main{
  public static void main(String[] args){
    int num=75432;
    int min=0;

  while(num>0){
    int rem=num%10;

    if(rem<min){
      min=rem;
    }
    num=num/10;
  }

  system.out.print(min);
  }
}
