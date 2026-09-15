import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		char s = st.nextToken().charAt(0);
		System.out.println(T.solution(str, s));
	}
	
	public String solution(String str, char s) {
		String result = "";
	
		int strLength = str.length();
		int[] distance = new int[strLength];
		int count = 1000;

		
		for (int i=0; i<str.length(); i++) {
			if(s == str.charAt(i)) {
				count = 0;
			} else {
				count++;
			}
			distance[i] = count; 
		}
		
		count = 1000;
		for(int i=str.length()-1; i>=0; i--) {
			if(s == str.charAt(i)) {
				count = 0;
			} else {
				count ++;
			}
			
			distance[i] = Math.min(distance[i], count);
			
		}

		StringBuilder sb = new StringBuilder();
		for(int x : distance) {
			sb.append(x).append(' ');
		}
		result = sb.toString().trim();
		return result;
	}

	
}