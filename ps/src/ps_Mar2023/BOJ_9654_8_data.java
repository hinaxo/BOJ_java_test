package ps_Mar2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9654_8_data {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer tokens;

	public static void main(String[] args) throws IOException {
		System.out.println("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n"
				+ "N2 Bomber      Heavy Fighter  Limited    21        \n"
				+ "J-Type 327     Light Combat   Unlimited  1         \n"
				+ "NX Cruiser     Medium Fighter Limited    18        \n"
				+ "N1 Starfighter Medium Fighter Unlimited  25        \n"
				+ "Royal Cruiser  Light Combat   Limited    4         ");
	}
}
