package ps_Feb2023;
import java.util.Scanner;

public class BOJ_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
