package Buoi2_3;

import java.util.Scanner;

public class bai4 {

	public static boolean isValidTriangle(int a, int b, int c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}

	// Hàm kiểm tra tam giác vuông
	public static boolean isRightTriangle(int a, int b, int c) {
		// Kiểm tra định lý Pythagoras
		return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
	}

	// Hàm kiểm tra tam giác đều
	public static boolean isEquilateralTriangle(int a, int b, int c) {
		return (a == b) && (b == c);
	}

	// Hàm kiểm tra tam giác vuông cân
	public static boolean isIsoscelesRightTriangle(int a, int b, int c) {
		return (a == b) && (a * a + b * b == c * c);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập các cạnh của tam giác
		System.out.print("Nhập cạnh a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập cạnh b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập cạnh c: ");
		int c = scanner.nextInt();

		// Kiểm tra tam giác có hợp lệ không
		if (!isValidTriangle(a, b, c)) {
			System.out.println("Đây không phải là một tam giác hợp lệ.");
		} else {
			System.out.println("Đây là một tam giác hợp lệ.");

			// Kiểm tra loại tam giác
			if (isEquilateralTriangle(a, b, c)) {
				System.out.println("Đây là một tam giác đều");
			} else if (isRightTriangle(a, b, c)) {
				System.out.println("Đây là một tam giác vuông");
			} else if (isIsoscelesRightTriangle(a, b, c)) {
				System.out.println("Đây là một tam giác vuông cân");
			} else {
				System.out.println("Đây là một tam giác thường");
			}
		}

		scanner.close();
	}
}
