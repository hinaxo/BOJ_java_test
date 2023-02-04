package ps_Feb2023;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2438_fast {
	static StringTokenizer tokens; //한줄에 여러개 입력받을 경우 스트링 쪼개줌.
	static StringBuilder sb = new StringBuilder();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//class, instance, static 
	
	public static void main(String[] args) throws IOException {
		int num;
		
		String input = br.readLine();
		num = Integer.parseInt(input);
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
