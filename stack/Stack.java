import java.util.Scanner;

public class Stack{
	private String[] array = new String[5];
	private int arrayIndex = -1;
	Scanner sc = new Scanner(System.in);

	void enterSyntax(){
		System.out.println("Enter Command");
		String syx = sc.nextLine();
		switch(syx){
			case "insert":
				System.out.println("Enter Item -");
				String i = sc.nextLine();
				insert(i);
				break;
			case "front": 
				System.out.print("Front Element is -> ");
				front();
				break;

			case "print":
				print();
				break;

			case "remove":
				remove();
				break;

			case "clear":
				clear();
				break;

		}
	}

	void insert(String item){
		arrayIndex++;
		if(arrayIndex>4){
			arrayIndex = 4;
		}
		array[arrayIndex] = item;
		enterSyntax();
	}

	void front(){
		System.out.println(array[arrayIndex]);
		enterSyntax();
	}

	void remove(){
		array[arrayIndex] = array[arrayIndex + 1];
		arrayIndex-- ;
		if(arrayIndex<0){
			arrayIndex = 0 ;
		}
		enterSyntax();
	}

	void print(){
		for(int i=0;i<arrayIndex + 1;i++){
			System.out.println(array[i] + " ");
		}
		enterSyntax();
	}

	void clear(){
		String[] array = new String[5];
		System.out.println("true");
		enterSyntax();
	}
}
