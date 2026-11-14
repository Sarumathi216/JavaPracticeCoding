public class Main{
  public static void main(String[] args){
    String s="Hello java @123 #world";
    int digit=0;
    int spaces=0;
    int special=0;

  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);

    if(ch=='0'&&ch=='9'){
      digit++;
    }
    else if(ch==' '){
      spaces++;
    }
    else if(!(ch=='A'&&ch=='Z')||(ch=='a'&&ch=='z')){
      special++;
    }
  }
    System.out.print("Digits:"+digits);
    System.out.print("Spaces:"+spaces);
    System.out.print("Special:"+special);
  }
}
    
