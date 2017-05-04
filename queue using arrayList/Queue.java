import java.util.Scanner;
import java.util.ArrayList;

public class Queue{
    private int index = 0;
    private ArrayList<String> q = new ArrayList<String>();

    Scanner S = new Scanner(System.in);
    void enterSyntax(){
      System.out.println("Enter Syntax -");
      String x = S.nextLine();
      switch(x){
        case "enqueue":
          System.out.println("Enter Element - ");
          String i = S.nextLine();
          enqueue(i);
          break;

        case "dequeue":
          dequeue();
          break;

        case "print":
          print();
          break;

        case "clear":
          clear();
          break;

        case "size":
          size();
          break;
      }
    }

    void enqueue(String item){
      q.add(item);
      index++ ;
      print();
    }

    void dequeue(){
      if(index>0){
        q.remove(0);
        index-- ;
        print();
      }
    }

    void print(){
      System.out.println(q);
      enterSyntax();
    }

    void clear(){
      q = new ArrayList<String>();
      index = 0;
      print();
    }

    void size(){
      System.out.println(index);
      enterSyntax();
    }
}
