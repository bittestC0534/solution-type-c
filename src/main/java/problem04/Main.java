package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int value = sc.nextInt();
		int value2 = sc.nextInt();

		String[] problem = new String[value2];
		
		for (int i = 0; i < problem.length; i++) {
			for(int j = start; j <= end; j++) {
				for(int k = 0; k < value; k++) {
					
					int rnd = new Random().nextInt(9) + 1;
					
					for (int l = 0; l < i; l++) {
						if(problem[i].equals(String.format("%dx%d", j, rnd))) {
							i--;
						}
							
					}
					
				}
			}
			
		}
		
	}
}