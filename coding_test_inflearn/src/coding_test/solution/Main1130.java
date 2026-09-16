import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int f1 = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[f1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<f1; i++) {
			arr1[i] = Integer.parseInt(st.nextToken(" "));
		}
		
		st = new StringTokenizer(br.readLine());
		int f2 = Integer.parseInt(st.nextToken());
		int[] arr2 = new int[f2];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<f2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken(" "));
		}

		System.out.print(T.solution(f1, f2, arr1, arr2));
	}
	
	
	public String solution(int f1, int f2, int[] arr1, int[] arr2) {
		String result = "";
		
		ArrayList<Integer> arr = new ArrayList<>();
		int minCount = Math.min(f1, f2);
		
		int lt = 0;
		int rt = 0;
		while (lt < f1 && rt < f2) {
			if (arr1[lt] < arr2[rt]) {
				arr.add(arr1[lt]);
				lt++;
			}
			else if (arr1[lt] > arr2[rt]) {
				arr.add(arr2[rt]);
				rt++;
			}
			else {
				arr.add(arr1[lt]);
				lt++;
			}
		
		}
		
		for(int i=lt; i<f1; i++) {
			arr.add(arr1[i]);
		}


		for(int i=rt; i<f2; i++) {
			arr.add(arr2[i]);
		}

		for(int i=0; i<arr.size(); i++) {
				result += arr.get(i) + " ";
		}
		
		return result;
	}
}