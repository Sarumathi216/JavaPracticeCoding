public class Main{
  public static void main(String[] args){
    String str="Programming";
    int result=" ";

  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);

    if(result.indexof(ch)==-1){
      result=result+ch;
    }
  }
    System.out.print(result);
  }
}

    
    
