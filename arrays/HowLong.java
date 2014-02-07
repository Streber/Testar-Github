/*
What is the last element of the following array?
Is it a[N]
or
Is it a[N-1]  <- Correct Answer!
*/

public class HowLong{

public static void main(String [] args){
	int N = 5;
	int [] a = new int [N];
	a[N-1] = 5;
	System.out.println(a[N-1]);
	
	//a[N] = 6;
	//System.out.println(N);
}

}