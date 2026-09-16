import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Main {

	
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int window = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, window, arr));
	}
	
	public int solution(int n, int window, int[] arr) {
		int result = 0;
		
		
		for(int i=window-1; i<n; i++) {
			int tmp = 0;
			int count = 0;
			
			while(count < window) {
				tmp += arr[i - count];
				count++;
			}
			
			result = Math.max(result, tmp);
		}
		
		return result;
	}
}