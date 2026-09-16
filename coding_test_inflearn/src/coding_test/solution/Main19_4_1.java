import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.next());
		
		System.out.println(T.solution(tc));
		
	}
	
	public String solution(int tc) {
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int[tc];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2; i<tc; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int x : arr) {
			sb.append(x).append(" ");
		}
		
		return sb.toString();
	}
	
}