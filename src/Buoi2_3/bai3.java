package Buoi2_3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 3 so thuc: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Tam giac hop le");
		} else {
			System.out.println("Tam giac khong hop le");
		}

		sc.close();
	}
}
