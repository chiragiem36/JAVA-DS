import java.util.ArrayList;
import java.util.Scanner;

public class Stack2{
	private ArrayList<String> aL = new ArrayList<String>();
	private int index = -1;
	Scanner sc = new Scanner(System.in);

	void enterSyntax(){
		System.out.println("Enter Command");
		String x = sc.nextLine();
		switch(x){
			case "insert":
				String i = sc.nextLine();
				insert(i);
				break;

			case "remove":
				remove();
				break;

			case "clear":
				clear();
				break;

			case "print":
				print();
				break;

		}
	}

	void insert(String item){
		aL.add(item);
		index++ ;
		enterSyntax();
	}

	void remove(){
		if(index > -1){
			aL.remove(0);
			index-- ;
		}
		if(index < -1){
			index = -1;
		}
		enterSyntax();
	}

	void print(){
		System.out.println(aL);
		enterSyntax();
	}

	void clear(){
		aL = new ArrayList<String>();
		enterSyntax();
	}
}
