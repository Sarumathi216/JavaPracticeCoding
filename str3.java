public class Main{
  public static void main(String[] args){
    String str="Hello";
    int vowels=0;
    int consonents=0;

  for(int i=0;i<str.length();i++){
    char ch=charcter.toLowerCase(str);

    if(ch>='a'&&ch<='z'){
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
      vowels++;
    }
    else{
      consonent++;
    }
  }
  }
  System.out.print("Vowels:"+vowels);
  System.out.print("Consonent:"+consonent);
  }
}

  
    
