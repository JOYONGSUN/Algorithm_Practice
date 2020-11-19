package SUNGYU;

import java.util.Scanner;

public class a_Test {
	public static void main(String[] args) {
		//1.입출력
		System.out.println("Hello World!");
		
		//2.if문(두 수 비교하기)
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		String result = "";
		if(A < B) {
			result = "<";
		}else if(A > B) {
			result = ">";
		}else {
			result = "==";
		}
		System.out.println(result);
	}

}
