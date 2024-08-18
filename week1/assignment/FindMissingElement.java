package week1.assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input= {1,4,3,6,5};
		int missingNumber=0;

		Arrays.sort(input);
		
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=i+1)
			{
				missingNumber=i+1;
		        break;
			}
		}
		System.out.print(missingNumber+" is the missing number");		
	}
}
