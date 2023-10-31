package week2.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=15,count=0;
		if(num>=1) {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					count++;
				}
			}
				if(count>1)
					System.out.println(+num +" Is Not a Prime number");
					else System.out.println(+num +" Is a Prime number");
		}
	}

}
