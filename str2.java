public class Main{
  public static void main(String[] args){
    String s="madam';
    string rev=" ";

  for(int i=s.lenth()-1;i>=0;i--){
    rev=rev+s.charAt(i);
  }
    if(s.equals(rev)){
      System.out.print("palindrome");
    }
    else{
      System.out.print("not a palindrome");
    }
  }
}
