public class Main{
public static void main(String[] args){
  String str="Java is Easy";
  String[] words=str.split(" ");

  for(int i=0;i<words.length;i++){
  for(int j=words.length;j>=0;j--){
    System.out.print(words[i].charAt(i));
  }
  }
}
    
    
    
