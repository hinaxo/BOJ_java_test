package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13_matrixMax_2566 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {

		int[][] arr = new int [9][9];
		int max = -1;
		String coordinate = "";
		for(int i=0; i<9; i++) {
			tokens = new StringTokenizer(br.readLine()); //입력값 받기 
			for(int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(tokens.nextToken()); 
				if(arr[i][j] > max) {
					max = arr[i][j];
					int row = i+1;
					int column = j+1;
					coordinate = row + " " + column;
				}
			}
		}
		System.out.println(max);
		System.out.println(coordinate);
	}
}
