package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2588 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	static int firstNum;
	static String secondNum;
	public static void main(String[] args) throws IOException {
		firstNum = Integer.parseInt(br.readLine());
		secondNum = br.readLine();
		for(int i = secondNum.length(); i > 0; i--) {
			secondNum.substring(i-1, i);
			System.out.println(firstNum * Integer.parseInt(secondNum.substring(i-1, i)));
			//(2, 3) 잘라서 'secondNum의 일의자리' * firstNum 
			//(1, 2) 잘라서 'secondNum의 십의자리' * firstNum 
			//(0, 1) 잘라서 'secondNum의 백의자리' * firstNum 
		}
		System.out.println(firstNum * Integer.parseInt(secondNum));
	//전체 곱셈 출력 
	}
}
