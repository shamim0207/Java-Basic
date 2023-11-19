// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.*;

public class Main {


    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
  Scanner sc=new Scanner(System.in);
  int button=sc.nextInt();
  switch(button){
      case 1:
          System.out.println("hello");
          break;
      case 2:
          System.out.println("hi");
          break;
      case 3:
          System.out.println("okkh");
      default:
          System.out.println("invalid");
  }

  for(int i=0;i<10;i++){
      System.out.println(i);
  }
  int j=0;
  while(j<9){
      System.out.println(j+"hello world.");
      j++;
  }
    }
}