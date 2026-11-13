public class Main{
  public static void main(String[] args){
    int num=12789;
    int evensum=0;
    int oddsum=0;

  while(num>0){
    int rem=num%10;

    if(rem % 2==0){
      evensum=evensum+rem;
    }
    else{
      oddsum=oddsum+rem;
    }
    num=num/10;
  }
    System.out.print("Evensum:"+evensum);
    System.out.print("Oddsum:"+oddsum);
  }
}
