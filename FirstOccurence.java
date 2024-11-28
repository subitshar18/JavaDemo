/*
 * Array : 2. Given an array of integers of size N, the task is to find the first non-repeating element in this array. 
Examples:
Input: {-1, 2, -1, 3, 0} Output: 2 Explanation: The first number that does not repeat is : 2
Input: {9, 4, 9, 6, 7, 4} Output: 6
 */
package com.subi;

import java.util.HashMap;
import java.util.Map;

public class FirstOccurence {

	public static void main(String[] args) {
		//int j;
		int a[]= {-1,2,-1,3,0};
//		for(int i=0;i<a.length;i++) {
//			for(j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					break;
//				}
//			}
//			if(j==a.length) {
//			System.out.println(a[i]);
//			break;
//			}
//		}
		
		Map<Integer,Integer> frequency=new HashMap<>();
		
		for(int i:a) {
			frequency.put(i, frequency.getOrDefault(i,1)+0);
		}
		
		for(int num:a) {
			if(frequency.get(num)==1) {
				System.out.println(frequency.get(num));
				break;
			}
		}
		

	}

}
