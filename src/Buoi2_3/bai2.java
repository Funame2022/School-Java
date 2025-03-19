package Buoi2_3;

import java.util.Scanner;

public class bai2 {
	public static String convertToWords(int num) {
		if (num == 0) {
			return "không";
		}

		String[] ones = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		String[] tens = { "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi",
				"chín mươi" };
		String[] hundreds = { "", "một trăm ", "hai trăm ", "ba trăm ", "bốn trăm ", "năm trăm ", "sáu trăm ",
				"bảy trăm ", "tám trăm ", "chín trăm " };

		String result = "";

		// Chuyển số trăm
		result += hundreds[num / 100];
		num %= 100;

		// Xử lý số mười
		if (num >= 10 && num < 20) {
			if (num == 10) {
				result += " mười";
			} else {
				result += " mười " + ones[num % 10];
			}
		} else {
			result += tens[num / 10];
			num %= 10;
		}

		// Xử lý số đơn vị
		if (num > 0) {
			result += " " + ones[num];
		}

		return result.trim();
	}

	public static void main(String[] args) {
		// Tạo đối tượng Scanner để nhập liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);

		// Nhập số từ bàn phím
		System.out.print("Nhập một số (0 - 999): ");
		int number = scanner.nextInt();

		// In ra số dưới dạng chữ
		System.out.println("Số " + number + " dưới dạng chữ là: " + convertToWords(number));

		scanner.close();
	}
}
