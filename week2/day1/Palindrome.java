package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		int input=1221,output=0,remainder;
int temp=input;
while(temp>0) {
	remainder=temp%10;
	output=(output*10)+remainder;
	temp=temp/10;
    }
if(input==output) {
	System.out.println("Palindrome");
}
	else
	{
		System.out.println("Not a Palindrome");
	}
	}

}
