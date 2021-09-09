import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number to count down or up from");

    Scanner s = new Scanner (System.in);
    int num = s.nextInt();
    int goal = 0;
  
  if (num < 0) {
      while (num <= goal){
        System.out.println(num);
        num ++;
      }
    }
    else if (num > 0){
      while (num >= goal){
        System.out.println(num);
        num--;
      }
      
    }
    System.out.println("Blast off!!");
  }
}