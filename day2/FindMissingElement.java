package week2.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr[] = {1,4,3,2,8,6,7};
		int j=1;
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==j) {
				j++;
			}
		}
				System.out.println(j);
	}
}
