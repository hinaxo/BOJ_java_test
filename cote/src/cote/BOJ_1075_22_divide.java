package cote;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1075_22_divide {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		String N = br.readLine();
		String MinN = N.substring(0,N.length()-2) + "00";
		int num = Integer.parseInt(br.readLine());
		int extra = num-Integer.parseInt(MinN)%num;
		int result = Integer.parseInt(MinN) + extra; 
		
		if(Integer.parseInt(MinN)%num == 0) {
			System.out.println("00");
		} else {
			String stringResult = String.valueOf(result); //"1926"
			System.out.println(stringResult.substring(stringResult.length()-2)); //"26"
		}
	}
}
