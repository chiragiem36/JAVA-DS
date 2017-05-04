import java.util.Scanner;
import java.util.ArrayList;

public class linkedList{
  Scanner S = new Scanner(System.in);
  Node head = null;
  Node current = null;
  int length = 0;
  void enterSyntax(){
    System.out.println("Enter Syntax - ");
    String x = S.nextLine();
    switch(x){
      case "append":
        System.out.println("Enter item - ");
        String item = S.nextLine();
        append(item);
        print();
        break;

      case "indexOf":
        System.out.println("Find Index Of - ");
        String y = S.nextLine();
        indexOf(y);
        break;

      case "removeAt":
        System.out.println("Enter Index - ");
        int remAt = S.nextInt();
        removeAt(remAt);
        break;

      case "insert":
      System.out.println("Enter What ??");
        String i = S.nextLine();
        System.out.println("Enter At -");
        int n = S.nextInt();
        insert(i,n);
        break;

      case "print":
        print();
        break;

      case "clear":
        clear();
        break;

      default: System.out.println("Invalid Syntax");
    }
  }

  void append(String item){
    Node node = new Node();
    node.element = item;
    if(length == 0){
      head = node;
    } else {
      current = head;
      while(current.next != null){
        current = current.next;
      }
      current.next = node;
    }
    length++;
    print();
  }

  void insert(String i, int n){
    current = head;
    Node previous = null;
    int a = 0;
    Node node = new Node();
    node.element = i;
    if(n == 0){
      node.next = head;
      node = head;
    } else {
      current = head;
      while(a<n){
        previous = current;
        current = current.next;
        a++ ;
      }
      previous.next = node;
      node.next = current;
    }

    length++ ;
    print();
  }

  void removeAt(int rmat){
    current = head;
    int a = 0;
    if(rmat == 0){
      head = current.next;
    } else {
      Node previous = null;
      while( a < rmat ){
        previous = current;
        current = current.next;
        a++ ;
      }
      previous.next = current.next;
    }
    length-- ;
    print();
  }

  void indexOf(String z){
    current = head;
    int ind = 0;
    while(current.element != z){
      current = current.next;
      ind++ ;
    }
  }

  void clear(){
    head = null;
    print();
  }

  void print(){
    ArrayList<String> array = new ArrayList<String>();
    current = head;
    array.add(current.element);

    while(current.next != null ){
      current = current.next;
      array.add(current.element);
    }
    System.out.println(array);
    enterSyntax();
  }
}
