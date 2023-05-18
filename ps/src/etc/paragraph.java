package etc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class paragraph {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		String paragraph = br.readLine(); //원본 문장 
		String newParagraph = ""; // 출력용 문장 
		int end = 0;
		int cnt = paragraph.length() - paragraph.replace(String.valueOf('.'),"").length();
		
		for(int i=0; i<cnt; i++) {
			end = paragraph.indexOf(".")+1;
			newParagraph += "\n\n" + paragraph.substring(0, end);
			paragraph = paragraph.substring(end, paragraph.length());
		}
		System.out.println(newParagraph);
	}
}