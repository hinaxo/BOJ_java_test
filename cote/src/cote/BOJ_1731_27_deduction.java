package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1731_27_deduction {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		int[] array = new int[N];
		int output = 0;
		for(int i=0; i<N; i++) {
			num = Integer.parseInt(br.readLine());
			array[i] = num;
		}
		if(array[N-1]-array[N-2] == array[N-2]-array[N-3]) { //등차수열 경우 
			output = array[N-1] + array[N-1]-array[N-2];
		} else if(array[N-1]/array[N-2] == array[N-2]/array[N-3]){ //등비수열 경우 
			output = array[N-1] * (array[N-1]/array[N-2]);
		}
		System.out.println(output);
	}
}
