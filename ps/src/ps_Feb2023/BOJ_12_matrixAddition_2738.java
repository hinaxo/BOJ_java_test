package ps_Feb2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12_matrixAddition_2738 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		tokens = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokens.nextToken()); //행 
		int M = Integer.parseInt(tokens.nextToken()); //열 
		int[][] matrixA = new int[N][M];
		int[][] matrixB = new int[N][M];
		for(int i=0; i<N; i++) { //행의 개수만큼 for문 돌리기 
			tokens = new StringTokenizer(br.readLine()); //행렬A 요소 추가 			
			for(int j=0; j<M; j++) {
				matrixA[i][j] = Integer.parseInt(tokens.nextToken());
			}
		}
		for(int i=0; i<N; i++) { //행의 개수만큼 for문 돌리기 
			tokens = new StringTokenizer(br.readLine()); //행렬B 요소 추가 			
			for(int j=0; j<M; j++) {
				matrixB[i][j] = Integer.parseInt(tokens.nextToken());
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
