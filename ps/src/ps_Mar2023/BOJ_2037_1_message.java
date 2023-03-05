package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2037_1_message {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		tokens = new  StringTokenizer(br.readLine());
		int p = Integer.parseInt(tokens.nextToken());
		int w = Integer.parseInt(tokens.nextToken());
		String message = br.readLine();
		int preLocation = 0;
		String alphabet = "";
		String[][] array =  {{"A", "B", "C"}, {"D","E","F"}, {"G","H","I"},{"J","K","L"},{"M","N","O"},{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
		// 입력받은 메세지-> 앞에서부터 순서대로 잘라서 array 배열 안에서 위치 찾기
		// 첫번째 알파벳이 아닐 경우(i가 0이 아닐 경우), 이전 값(i-1)의 배열(j)과 같은지 비교  
		for(int i=0; i<message.length(); i++) {
			alphabet = message.substring(i, i+1);//문자 자르기 
			for(int j=0; j<8; j++) {
				for(int l=0; l<array[j].length; l++) { //해당 행의 length로 길이 조건 잡기 
					if(alphabet.equals(array[j][l])) { //문자 알파벳 찾기 
						if(i!=0) {
							if(preLocation == j) {
								
							}
						}
					} else if(alphabet == " "){ //alphabet 이 공백일때 
						
					}

				}
			}
		}
	}
}
