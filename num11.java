public class Main{
  public static void main(String[] args){
    int start=1;
    int end =20;

  for(int num=start;num<=end;num++){
    boolean prime=true;

    if(num<=1){
      prime=false;
    }
    else{
      for(int i=2;i<num;i++){
        if(num % i==0){
          prime=false;
          break;
        }
      }
    }
      if(prime){
      System.out.println(num+" ");
    }
  }
  }
}
