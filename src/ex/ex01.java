package ex;
/*
 * Topic: 請設計一樂透亂數選號程式，由 1~42 中選出 6個不重覆的數字組合並輸出。 請使用已下方式,(setSeed就是設定亂數種子，可以使每次跑出的亂數序列，都會是一樣的)
 例如:輸入 23323456會得到 39  17  32  13  41  15 
	Random randnum = new Random();
	randnum.setSeed(23323456)
 * Date: 2016/11/28
 * Author: 105021026 詹佩郡
 */

import java.util.Random;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		Random ran = new Random();
//		int a =scn.nextInt();
//		ran.setSeed(a);
//		int b[]=new int[6];
//		for(int i=0;i<6;i++){
//			b[i]=ran.nextInt(6)+1;
//		}
//		for(int j=0;j<6;j++){
//			for(int i=6;i>j;i--){
//				if(b[i]==b[j]){
//					b[j]=ran.nextInt(6)+1;				}
//				}
//			System.out.print(b[j]+" ");
//			}
		int i=0;
		int b[]=new int[6];
		ran.setSeed(42);
		while(i<6){
			 b[i]=ran.nextInt(42)+1;
			 boolean flag=false;
			 int j=i-1;
			 while(!flag && j>=0){
				 if(b[i]==b[j]){
					 flag=true;
					 j--;
				 }
			 }
		if(flag==false){
		i++;
		}
		}
		}
	}

