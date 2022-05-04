/*Solution
Answer : option B

			---------
	2.	^	99 + (98)   ->3.  99 + 98  = 197
			---------
	1.	^	100 + (99)  ->4. 100 + 197 = 297 
  steps     ---------
			 stack
*/
class MCQ2{
	
	 static int sum(int n) {
	 
		if (n==98)
		   return n;
		else
		   return n + sum(n-1);    
	}
	
	public static void main(String []args){
		
	System.out.println(sum('d'));
	
	}
}

/*
Q.What will be the output of the above code ?
	A. 98
	B. 297
	C. stackoverflow
	D. compile time error
*/







