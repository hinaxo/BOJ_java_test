package cote;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1373_27_biOctal {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		String[] BinaryToOct = {"000", "001", "010", "011", "100", "101", "110", "111"};
		String[] OctArr = {"0", "1", "2", "3", "4", "5", "6", "7"}; 
		String input = br.readLine();
		String chunk = "";
		int length = 0;
		int idx = 0;
		StringBuilder output = new StringBuilder();
		
		if(input.length()%3 == 1) {
			input = "00" + input;
		} else if(input.length()%3 ==2) {
			input = "0" + input;
		} 
		length = input.length();
		for(int i=0; i<length; i++) {
			if(i%3 == 0) {
				chunk = input.substring(i,i+3);
				idx = Arrays.binarySearch(BinaryToOct, chunk);
				String binary = OctArr[idx];
				output = output.append(binary);
			}
		}
		System.out.println(output);
	}
}
