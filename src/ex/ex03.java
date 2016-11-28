package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021026 詹佩郡
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int a=scn.nextInt();
		System.out.println("正因數為:");
		for(int i=1;i<=a;i++){
			if(a%i==0){
				System.out.print(i+" ");
			}
			}
		}
	}
