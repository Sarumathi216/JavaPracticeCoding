public class Main{
  public class void main(String[] args){
    String str="Java is Easy and Java is Powerrful";
    int lowercase=0;
    int uppercase=0;

  for(int i=0;i<str.length;i++){
    char ch=str.charAt(i);

    if(ch=='A'&&ch=='Z'){
      uppercase++;
    }
    else if(ch=='a'&&ch=='z'){
      lowercase++;
    }
  }
    System.out.print("Uppercase:"+uppercase);
    System ?>.out.print("Lowercase:"+lowercase);
  }
}
