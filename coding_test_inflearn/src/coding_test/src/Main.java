import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {

	
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String str = br.readLine();
		
		System.out.println(T.solution(n, str));
	}
	
	public String solution(int n, String str) {
		String result = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] people = {"A", "B", "C", "D", "E"};
				
		for(int i=0; i<people.length; i++) {
			map.put(people[i], 0);
		}
		
		for(int i=0; i<str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			map.put(s, map.get(s)+1);
			
		}
		
		int value = 0;
		for(int i=0; i<map.size(); i++) {
			if(value < map.get(people[i])) {
				value = map.get(people[i]);
				result = people[i];
			}
		}
		
		
		return result;
	}
}