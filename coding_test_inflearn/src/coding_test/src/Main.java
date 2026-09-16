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
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(n, k, arr));
	}
	
	public int solution(int n, int k, int[] arr) {
		int result = 0;
		
		int lt = 0;
		int rt = 0;
		for(int i=0; i<arr.length; i++) {
			lt = i; 
			rt = lt+1;
			int tmp = 0;
			tmp += arr[lt];
		
			if(tmp == k) {
				result++;
			} else {
				while (tmp <= k && rt < arr.length) {
					tmp += arr[rt];
					if(tmp == k) result++;
					rt++;
				}	
			}
			
			
		}
		
		
		
		return result;
	}
}