package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1672_8_dnaDecode {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		String[][] array = {{"A","C","A","G"}, {"C","G","T","A"}, {"A","T","C","G"}, {"G","A","G","T"}};
		int N = Integer.parseInt(br.readLine());
		String sequence = br.readLine();
		String left = sequence;
		String[] alphabet = new String[2];
		int[] location = new int[2];
		// A=0, G=1, C=2, T=3
		// 염기서열에서 끝자리 두개 제거 -> left 에 넣기
		// 끝자리 두개 알파벳 각각 숫자로 변환 
		// 변환된 숫자로 array 에서 염기 찾기
		// 찾은 염기 left 에 추가 
		// left 가 한자리가 될 때까지 반복


		//AAGTCG
		for(int j=0; j<N; j++) { //염기서열 길이만큼 0, 1, 2, 3, 4, 5
			int length = left.length(); //현재 염기서열 길이 length = 6;
			if(length>=2) {
				alphabet[0] = left.substring(length-2, length-1); 
				alphabet[1] = left.substring(length-1);
				left = left.substring(0, length-2); 
				for(int i=0; i<2; i++) {
					if(alphabet[i].equals("A")) {
						location[i] = 0;
					} else if(alphabet[i].equals("G")) {
						location[i] = 1;
					} else if(alphabet[i].equals("C")) {
						location[i] = 2;
					} else if(alphabet[i].equals("T")) {
						location[i] = 3;
					}
				}
				left += array[location[0]][location[1]];
			}
		}
		System.out.println(left);
	}
}
