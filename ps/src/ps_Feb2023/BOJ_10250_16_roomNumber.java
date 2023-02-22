package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250_16_roomNumber {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			tokens = new StringTokenizer(br.readLine());
			int floor = Integer.parseInt(tokens.nextToken());
			int room = Integer.parseInt(tokens.nextToken());
			int num = Integer.parseInt(tokens.nextToken());

			if(Math.floorMod(num, floor) == 0) { //층수
				sb.append(floor*100 + Math.floorDiv(num, floor)).append("\n");
			} else {
				sb.append(Math.floorMod(num, floor)*100  + (Math.floorDiv(num, floor)+1)).append("\n");
			}
		}
		System.out.println(sb);
	}
}
