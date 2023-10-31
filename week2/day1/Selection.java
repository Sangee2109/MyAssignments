package week2.day1;

public class Selection {
	
	public void checkEligibility(int age) {
		if(age>=18) {
			System.out.println("You are eligible to vote/buy a driving license");
		}else {
			System.out.println("You are not eligible");
		}
	}
	
	public void phone(int mark) {
		if((mark>=90) && (mark<100))
		{
			System.out.println("I have got MacBook pro");
		} else if((mark>=70) || (mark<90)) {
				System.out.println("I got iPhone");
			}else if((mark<70) && (mark>45)){
				System.out.println("Study well!");
			} else {
				System.out.println("Enter valid mark");
			}
		
	}

	public static void main(String[] args) {
		Selection select = new Selection();
		select.checkEligibility(15);	
		select.phone(93);
		
	}

}
