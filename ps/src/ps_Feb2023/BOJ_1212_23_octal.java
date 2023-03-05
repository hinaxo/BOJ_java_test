package ps_Feb2023;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BOJ_1212_23_octal {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		String binary = "";
		String test = br.readLine();		
		
		String loaf = "";
		String left = test;
		int iCount = test.length()/3;
		int quotient = 0;
		int remainder = 0;
		String semiBinary = "";
//		Boolean flag = true;
		
		for(int i=0; i<iCount; i++) {
			loaf = left.substring(left.length()-3);
			left = left.substring(0, left.length()-3);
			for(int j=3; j>0; j--) { //j=3, 2, 1
				String indi = loaf.substring(j-1 ,j); //9, 8, 7
				for(int w=0; w<3; w++) {
					quotient = Integer.parseInt(indi)/2;
					remainder = Integer.parseInt(indi)%2;
					if(w==2 && quotient == 1) {
						semiBinary = "1" + semiBinary;
						break;
					} else {
						indi = String.valueOf(quotient);
						semiBinary = String.valueOf(remainder) + semiBinary;						
					}
				}
				if(semiBinary.length() == 1) {
					semiBinary = "00" + semiBinary;
				} else if(semiBinary.length() == 2) {
					semiBinary = "0" + semiBinary;
				}
			}
		}
		System.out.println(Integer.parseInt(semiBinary));
	}
}