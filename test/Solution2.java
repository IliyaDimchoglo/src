package test;

import java.util.Random;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Solution2 {
	public static void main(String[] args) {

		Solution2 obj = new Solution2();
		int[] array = { -5, -5, -5, -42, 6, 12 };
		System.out.println(obj.solution(array));

	}

	public int solution(int[] days) {
		int minWinterDays = days.length;
		boolean isWinter = true;
		int summer = 0;
		int winter = 0;

		for (int i = 0; i < days.length; i++) {
			if (!isWinter) {
				if (days[i] <= winter) {
					winter = summer;
					isWinter = true;
				}
			} else {
				if (days[i] > winter) {
					minWinterDays = i;
					summer = winter;
					isWinter = false;
				}
			}
		}
		return minWinterDays;
	}
}
