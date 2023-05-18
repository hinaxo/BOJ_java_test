package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5789_22_doordont {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			String message = br.readLine();
			int count = message.length()/2;
		
			if(message.charAt(count-1) == message.charAt(count)) {
				System.out.println("Do-it");
			} else {
				System.out.println("Do-it-Not");
			}
		}
	}
}
