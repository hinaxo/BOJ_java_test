package ps_Feb2023;

import java.util.Scanner;

public class BOJ_1330 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
