import java.util.Scanner;

public class Queue{
  private String[] array = new String[5];
  private int index = 0;
  Scanner S = new Scanner(System.in);
  void enterSyntax(){
    System.out.println("Enter Syntax - ");
    String x = S.nextLine();
    switch(x){
      case "push":
        String i = S.nextLine();
        push(i);
        break;

      case "shift":
        shift();
        break;

      case "print":
        print();
        break;
    }
  }

  void push(String item){
    if(index<4){
      array[index] = item;
      index++ ;
    } else {
      index = 0;
      array[index] = item;
      index++ ;
    }
    enterSyntax();
  }

  void shift(){
    for(int t=0;t<index-1;t++){
      array[t] = array[t + 1];
    }
    index-- ;
    enterSyntax();
  }

  void print(){
    for(int t=0; t<index; t++){
      System.out.println( array[t] + " ,");
    }
    enterSyntax();
  }
}
