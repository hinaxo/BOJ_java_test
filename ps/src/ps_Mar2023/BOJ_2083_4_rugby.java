package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2083_4_rugby {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		String name = "";
		int weight = 0;
		int age = 0;
		
		while(true){
			tokens = new StringTokenizer(br.readLine());
			name = tokens.nextToken();
			age = Integer.parseInt(tokens.nextToken());
			weight = Integer.parseInt(tokens.nextToken());
			if(name.equals("#")) {
				break;
			} else {
				if(age > 17 || weight >= 80) {
					sb.append(name + " " + "Senior");
					sb.append("\n");
				} else {
					sb.append(name + " " + "Junior");
					sb.append("\n");
				}
			}
		} 
		System.out.println(sb);
	}
}
