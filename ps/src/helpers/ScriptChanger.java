package helpers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class ScriptChanger {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		String newParagraph = "";
		System.out.println("?????");
		tokens = new StringTokenizer(br.readLine());		
		try {
			String paragraph;
			while(!(paragraph = br.readLine()).equals("")) {
				if(paragraph.contains("동영상을 재생하고")) { //삭제해야 하는 라인 
					
				} else {
					int end = 0;
					if(paragraph.contains(".")) {
						int cnt = paragraph.length() - paragraph.replace(String.valueOf('.'),"").length();
						for(int i=0; i<cnt; i++) {
							end = paragraph.indexOf(".")+1; //마침표가 있는 라인일 경우, 마침표 없는 라인 경우 나누기 
						
							newParagraph += "\n\n" + paragraph.substring(0, end).trim();
							paragraph = paragraph.substring(end, paragraph.length());
						}
					} else { //마침표가 없는 라인일 경우 
						newParagraph += "\n\n" + paragraph.trim();
					}
						
				}
			}
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println(newParagraph);		
	}
}