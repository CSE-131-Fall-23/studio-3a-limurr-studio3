package studio3;

import java.util.*;

public class Sieve {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("To what number would you like to find the primes?");
		int limit = in.nextInt();
		
		boolean[] track = new boolean[limit + 1];
		int[] num = new int[limit + 1];
		
		for(int i = 0; i <= limit; i++) {
			num[i] = i;
		}
		

		
		for(int i = 2; i <= limit/2; i++) {
			
			for(int j = i; j <= limit; j += i) {
				if(j != i) {
					track[j] = true;
				}
			}
		}
	
		
		
		for(int i = 2; i <= limit; i++) {
			if(track[i] == false) {
				System.out.println(num[i]);
			}
		}
		
		
	}

}
