package com.prac.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int totalTestCase = Integer.parseInt(bufferedReader.readLine());
		int k = 1;
		while(k <= totalTestCase)
		{
			int sizeOfcurrentTestCase = Integer.parseInt(bufferedReader.readLine());
			int arr[] = new int[sizeOfcurrentTestCase];
			int currentIndex = -1;
//			String str[] = ;
			for(String str1 : bufferedReader.readLine().split(" "))
			{
				arr[++currentIndex] = Integer.parseInt(str1);
			}
			
			int evenArr[] = new int[sizeOfcurrentTestCase%2==1?(sizeOfcurrentTestCase/2)+1:sizeOfcurrentTestCase/2];
			int oddArr[] = new int[(sizeOfcurrentTestCase/2)];
			//System.out.println("\n"+oddArr.length+"------");
			
			int l=-1,m=-1;
			for(int i =0 ;i<arr.length;i++)
			{
				if(i%2==0)
				{
					evenArr[++l] = arr[i];
				}
				else
				{
					//System.out.println(i+"'''''''''''''''''''");
					oddArr[++m] = arr[i];
				}	
			}
			Arrays.sort(oddArr);
			Arrays.sort(evenArr);
			int i=0,j=0,n=-1;
			while(i<=l && j<=m)
			{
				arr[++n] = n%2==0?evenArr[i++]:oddArr[j++];
			}
			while(i<=l)
			{
				arr[++n] = evenArr[i++];
			}
			while(j<=m)
			{
				arr[++n] = oddArr[j++];
			}
			boolean isOK = true;
			for(i = 0 ;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					System.out.println("Case #"+k+": "+(i));
					isOK=false;break
				}
			}
			if(isOK)
				System.out.println("Case #"+k+": OK");
//			System.out.println(Arrays.toString(arr));
			k++;
		}//while
	}
}
/*
all test cases did not passed on website but pp have litmited test case which are all passed
*/
