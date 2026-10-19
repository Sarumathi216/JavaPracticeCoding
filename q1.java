import java.util.Scanner;
class q1
{
    public static void main(String args[])
    { 
      Scanner scan = new Scanner(System.in);
      String color =scan.nextLine();

      if(color.equals("red"))
      {
        System.out.print("Stop");
      }
      else if(color.equals("yellow"))
      {
        System.out.print("Get ready");
      }
      else if(color.equals("green"))
      {
        System.out.print("go");
      }

      }

    }
