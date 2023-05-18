package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4493_17_game {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		int score1 = 0;
		int score2 = 0;
		for(int i=0; i<t; i++) { //테스트케이스 개수 
			int n = Integer.parseInt(br.readLine());
			score1 = 0;
			score2 = 0;
			for(int j=0; j<n; j++) { //가위바위보 게임 수 
				tokens = new StringTokenizer(br.readLine());
				String player1 = tokens.nextToken();
				String player2 = tokens.nextToken();
				if(player1.equals("R")) {
					if(player2.equals("P")) {
						score2 += 1;
					} else if(player2.equals("S")) {
						score1 += 1;
					} 
				} else if(player1.equals("S")) {
					if(player2.equals("R")) {
						score2 += 1;
					} else if(player2.equals("P")) {
						score1 += 1;
					} 
				} else if(player1.equals("P")) {
					if(player2.equals("S")) {
						score2 += 1;
					} else if(player2.equals("R")) {
						score1 += 1;
					} 
				}
			}
			if(score1 == score2) {
				System.out.println("TIE");
			} else if(score1 > score2) {
				System.out.println("Player 1");
			} else {
				System.out.println("Player 2");
			}
		}

	}
}

