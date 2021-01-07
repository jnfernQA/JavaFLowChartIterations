package com.qa.main;

public class Inputs1 {
	
	int A;
	boolean number = true;
	
//--------------------------------------------------	
	//Flowchart 1 method
	public void flowchart1(int A) {
		while (number) {
			System.out.println(A);
			A++;
	
			if (A > 200) {
				number = false;
			}
		}
	}

//---------------------------------------------------
	
	//Flowchart 2 method
	
	public void flowchart2(int A) {
		do {
			System.out.println(A);
			A++;
			if (A %2 == 0 == true) {
				System.out.println("-");
			
			}else {
				System.out.println("*");
			}
			
		}while( A <= 200);
	}
//----------------------------------------------------
	
	//Flowchart3
	
	public void flowchart3() {
		for (int A = 1; A <= 10; A++) {
			for (int numOfPrints = 1; numOfPrints < 10; numOfPrints++) {
				System.out.println(A);		
			}	
		}		
	}
	
//-------------------------------------------------------
	
	//Flowchart5

	public void flowchart5() {
		for(int A = 1; A <= 10; A++) {
			for(int numOfPrints2 = A; numOfPrints2 <= 10; numOfPrints2 += A) {
				System.out.println(A);
			}
					
		}
	}
}
