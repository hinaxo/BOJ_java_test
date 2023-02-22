package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class BOJ_10_arrayCountNum_10807 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		tokens = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(tokens.nextToken());
			if(array[i] == num) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}
