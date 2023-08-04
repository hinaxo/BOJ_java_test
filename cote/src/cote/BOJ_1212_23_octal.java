package cote;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1212_23_octal {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		// 맨앞의 0 없애기
//		String N = br.readLine();
		String binary = "";
		String test = "314";		
		String loaf = "";
		String left = test;
		int iCount = test.length()/3;
		int quotient = 0;
		int remainder = 0;
		String semiBinary = "";
		
		for(int i=0; i<iCount; i++) {
			loaf = left.substring(left.length()-3);
			left = left.substring(0, left.length()-3);
			for(int j=3; j>0; j--) { //j=0,1,2
				String indi = loaf.substring(j-1 ,j); //01, 12, 23
				System.out.println("!!!!!!!!!!"+indi);
				if(Integer.parseInt(indi) == 1) {
					//1은 이진수로 001 -> 001추가
					semiBinary = "001";
				} else {
					System.out.println("else");
					while (true) {
						System.out.println("while=> quotient? " + quotient);
						quotient = Integer.parseInt(indi)/2;
						remainder = Integer.parseInt(indi)%2;
						semiBinary = remainder + semiBinary;
						if(quotient == 1) {
							break;
						}
					}
					if(String.valueOf(semiBinary).length() == 1) {
						semiBinary = "00"+semiBinary;
					} else if(String.valueOf(semiBinary).length() == 2){
						semiBinary = "0"+semiBinary;
					}
					
					
//					quotient = Integer.parseInt(indi)/2;
//					remainder = Integer.parseInt(indi)%2;
//					semiBinary = remainder + semiBinary;
//					System.out.println("quotient?? "+quotient);
//					
					
					
				}
			}
			binary = semiBinary + binary;
			System.out.println("!!"+binary);
		}
		System.out.println(binary);
		
	}
}
