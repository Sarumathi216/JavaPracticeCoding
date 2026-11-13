public class Main{
  public static void main(String[] args){
    int num=151;
    int original=num;
    int rev=0;

  while(num>0){
    int rem = num%10;
    rev=rev*10+rem;
    num=num/10;
  }

  if(rev==original){
    System.out.print("The num is Palindrome");
  }
  else{
    System.out.print("The num is not Palindrome");
  }
  }
}
