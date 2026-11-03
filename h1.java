public class Main{
public static void main(String[]args){
  int []arr={10,25,8,40,30};
  int largest=integer.MIN_VALUE;
  int secondlargest=integer.MIN_VALUE;

  for(int i=0;i<arr.length;i++){
    if(arr[i]>largest){
      secondlargest=largest;
      largest=arr[i];

    }
    else if(arr[i]>secondlargest&&arr[i]!=largest){
      secondlargest=arr[i];
    }
    System.out.println("SecondLargest="+secondlargest);
  }
}
