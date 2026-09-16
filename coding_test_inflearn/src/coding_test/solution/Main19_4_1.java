import java.util.Scanner;



public class Main {
   
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String result = "";
		int cnt = 1;
		
		String checkStr = str + " ";
		char[] arrStr = checkStr.toCharArray();
		
		for(int i=0; i<checkStr.length()-1; i++) {
			int j = i+1;
			if(arrStr[i] == arrStr[j]) {
				cnt++; 
			} else {
				if(cnt == 1) {
					result += arrStr[i];
				} else {
					result += arrStr[i] + String.valueOf(cnt);
				}
				cnt = 1;
			}
		}
		
		return result;
	}

	
}