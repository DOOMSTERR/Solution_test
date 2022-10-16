package Assignment_questions;

import java.util.*;

/*
 * A number is good if it is divided by 7, but none of its digits is 7. 
For example, 14, 21, 28, and 140 are good numbers, but 7, 13, 147, and 700 are not good numbers. 

Method Signature:

public boolean isGoodNumber(int N){
//write code here
}
 */

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(isGoodNumber(N));
	}

	public static boolean isGoodNumber(int N) {
		if(contains_7(N) == false) {
			if(N%7 == 0) {
				return true;
			}
			else if(N%7 != 0) {
				return false;
			}
		}
		return false;
	}

	public static boolean contains_7(int num) {
		if(num == 7) {
			return true;
		}
		if(num < 0) {
			num = -num;
		}
		while(num >0) {
			if(num%10 == 7) {
				return true;
			}
			num = num/10;
		}
		return false;
	}
}
