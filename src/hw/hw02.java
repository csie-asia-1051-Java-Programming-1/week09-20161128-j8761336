package hw;

import java.util.Scanner;

/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021026 詹佩郡
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int sum = 1;
		for (int i = 0; i <= N; i++) {
			sum = sum + i;
			if (sum < N) {
				System.out.print(sum + " ");
			}
		}
		System.out.println();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");

			}

		}
	}

}
