package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2444_6_asterisk {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<=2*N-1; i++) {
			System.out.println("==== i?" +i);
			for(int j=0; j<=2*N-1; j++) {
				if(j<N-i) {
					System.out.print("j<N-i");
					System.out.print(" ");
				} else if(j>N-i) {
					System.out.print("j>N-i");
					System.out.print(" ");
				} else {
					System.out.print("j==");
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
