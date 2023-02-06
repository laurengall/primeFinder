import java.util.Scanner; 
import java.util.ArrayList; 
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int num1; 
    int num2; 
    System.out.println(); 
System.out.println("Type in your first number:"); 
    num1 = input.nextInt();
    System.out.println(); 
    System.out.println("Type in your second number:"); 
    num2 = input.nextInt();
System.out.println(); 
    findPrimes(num1, num2); 
  }
  public static void findPrimes(int num1, int num2){
    ArrayList<Integer> list = new ArrayList<Integer>();
    int i = num1; 
      while (i < num2){
        i ++; 
        if (i % 2 == 1){
          list.add(i); 
        }
        i++; 
      }
    int a = 1; 
    for (int x: list){
      
      System.out.println("Prime #" + a + " is " + x); 
      a++; 
    }
  }
}