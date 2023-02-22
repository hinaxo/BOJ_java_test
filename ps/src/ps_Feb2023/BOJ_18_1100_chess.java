package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_18_1100_chess {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		int cnt = 0;
		for(int i=0; i<8; i++) {
			String row = br.readLine();
			String[] arr = row.split("");
			for(int j=0; j<8; j++) {
				if(i%2 == 0) { //체스 홀수줄의 홀수번째가 하얀칸 (i==0,2,4,6)
					if(j%2 == 0 && arr[j].equals("F")) {
						cnt ++;						
					}
				} else { // 체스 짝수줄 (2, 4, 6, 8) -> 체스 짝수줄의 짝수번째가 하얀칸 (i==1,3,5,7)  
					if(j%2 !=0 && arr[j].equals("F")) {
						cnt ++;					
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
