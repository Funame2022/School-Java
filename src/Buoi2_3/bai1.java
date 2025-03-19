package Buoi2_3;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so A: ");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("Day la so nguyen duong");

		} else if (a == 0) {
			System.out.println("Day la so nguyen am");

		} else

		{
			System.out.println("Day la so nguyen am");
		}

		sc.close();
	}
}
