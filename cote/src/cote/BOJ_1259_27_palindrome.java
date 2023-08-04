package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1259_27_palindrome {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		Boolean flag = true;
		while(flag) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) {
				flag = false;
				break;
			}
			if(flip(input) == input) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}
		System.out.println(sb);
	}
	
	public static int flip(int num) {
		int output = 0;
		while(num != 0) {
			output = output*10 + num%10;
			num /= 10;
		}
		return output;
	}
}
