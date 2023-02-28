package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1037_28_divisor {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		tokens = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(tokens.nextToken());
		}
		System.out.println(getMax(array)*getMin(array));
		
	}
	public static int getMax(int[] array) {
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	public static int getMin(int[] array) {
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
}
