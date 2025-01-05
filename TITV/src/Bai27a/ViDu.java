package Bai27a;

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		//tên mảng đặt phía trước hay phía sau cũng được
		double[] mang1;
		double mang2[];
		
		mang1 = new double[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< mang1.length; i++) {
			System.out.println("nhập phần tử thứ "+ i +": ");			
			mang1[i] = sc.nextDouble(); 
		}
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			tong += i;
			
		}
		System.out.println("tổng của mảng: "+tong);
		
		mang2 = new double[] {1,2,3,4,5,6,};
	}

}
