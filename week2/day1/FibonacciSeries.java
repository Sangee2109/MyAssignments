package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0, num2=1, sum=0;
		System.out.println("Fibonacci series : ");
		for(int i=0;i<8;i++)
		{
		sum=num1+num2;		
		System.out.println(num1);		
		num1=num2;
		num2=sum;
		}
     
	}

}
