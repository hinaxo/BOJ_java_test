package ps_Feb2023;
import java.util.Scanner;

public class BOJ_2739 {
	public static void main(String[] args) {
		int level;
		Scanner sc = new Scanner(System.in);
		level = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(level + " * " + i + " = " + level*i);
		}
	}
}
