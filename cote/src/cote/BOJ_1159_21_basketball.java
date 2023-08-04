package cote;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
public class BOJ_1159_21_basketball {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			String name = br.readLine();
			arr[i] = name.substring(0, 1);
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList(arr));
		String[] newArr = linkedHashSet.toArray(new String[] {});
		String sum = "";
		boolean flag = false;
		for(int i=0; i<newArr.length; i++) {
			int cnt = 0;
			for(int j=0; j<arr.length; j++) {
				if(newArr[i].equals(arr[j])) {
					cnt ++;
				}
			}
			if(cnt >= 5) {
				flag = true;
				sum = sum + newArr[i];
			}
		}
		if(flag == true) {
			char[] arrangeSum = sum.toCharArray();
			Arrays.sort(arrangeSum);
			String output = new String(arrangeSum);
			System.out.println(output);	
		} else {
			System.out.println("PREDAJA");
		}	
	}
}