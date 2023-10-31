package week2.day1;

public class PrintEvenNumbers {
	public void printEvenNumber() {
		for(int i=1;i<=10;i++) {
			//Ctrl + Shift + b -- To set a breakpoint
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		
		PrintEvenNumbers num = new PrintEvenNumbers();
		num.printEvenNumber();

	}

}
