public class PerfectNumber {
	public static void main(String[] args) {
		perfect(10000);
	}
	
	//print all perfect numbers from 1 to n
	public static void perfect(int n){
	for (int i = 1; i<n; i++){
		int comp = 0;
		for (int j = 1; j<i; j++){
			if (i%j == 0)
				comp += j;	
		}
		if (comp == i)
			System.out.println(i);
		}
	}
	
	//returns true or false if n is an "imperfect number"
	//also includes perfect numbers
	public static boolean imPerfect(int n){
		int comp = 0;
		for (int i = 1; i<n; i++){
			if (n%i == 0)
				comp += i;	
		}
		return (comp == n || comp == n+1 || comp == n-1 || comp == n+2 || comp == n-2);
	}
}
