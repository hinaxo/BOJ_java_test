package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sleuth {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
//		fill- cyan (0,255,255)
//		stroke - green (0,255,0)
//		font- Melissa

		Boolean font = false;
		Boolean stroke = false;
		Boolean fill = false;
		for(int i=0; i<227; i++) {
			String line = br.readLine();
//			System.out.println("========== line??" +line);
//			System.out.println("===============fill :" +fill);
//			System.out.println("===============stroke :"+stroke);
//			System.out.println("===============font :"+font);
			if(line.contains("fill")) {
				if(line.contains("fill(0,255,255)")) { //fill cyan이면 
					fill = true;
				} else {
					fill = false;
				}
			}
			if(line.contains("stroke")) {
				if(line.contains("stroke(0,255,0)")) { //stroke green 이면 
					stroke = true;
				} else {
					stroke = false; 
				} 		
			}
			if(line.contains("textFont")) {
				if(line.contains("textFont(Melissa)")) {
					font = true;
				} else {
					font = false; 
				}				
			}
			if(fill && stroke && font) {
				System.out.println("-------------------------------------------------------------------------------comment out : " + (i+1));
			}
		}
		
	}
}
