package test;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int a = -2;
		int b = 17;
		Solution obj = new Solution();
		int result = obj.solution(a, b);
		if (obj.solution(a, b) == 0) {
			System.err.println("ERROR");
		} else {
			System.out.println("First num " + a + ";\n" + "Second num " + b + ";\n" + "Result " + result);
		}
	}

	public int solution(int a, int b) {
		int countNum = 0;
		if (a <= b && a >= -2 && b <= 647) {
			for (int i = a; i <= b; i++) {
				if (Math.sqrt(i) % 1 == 0 && i !=0) {
					countNum++;
				}else {
					continue;
				}
			}
			return countNum;
		}
		{
			return 0;
		}

	}

}