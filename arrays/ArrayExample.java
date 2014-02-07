
public class ArrayExample {
	public static void main (String [] args){
		int N = 10; //size of array
		double [] a; //declare the array
		a = new double[N]; //create the array
		for (int i = 0; i < N; i++) //initialize the array
			a[i] = 0.0;


	// A compact alternative

		double [] b = new double[N]; //all elements zero by default

	// Dot product

		double [] x = {0.2, 0.1, 0.2};
		double [] y = {1.2, 1.3, 9.1};

		int M = x.length;

		double sum = 0.0;

		for (int i = 0; i < M; i++){
			sum = sum + x[i]*y[i];
		}

		System.out.println("The dot product of x and y is: " +sum);

	// Create and array with random values
		System.out.println("An array with random values:");
		double [] c = new double [N];
		for (int i = 0; i < N; i++){
			
			c[i]=Math.random();
			System.out.println(c[i]);
			
		}

	// Find the maximum value of previous array
		double max = Double.NEGATIVE_INFINITY; // What is this? It is negative infinity as a double
		for (int i = 0; i < N ; i++){
			if (c[i] > max) max = c[i];
		}
		System.out.println("The maximum value is: " + max);

	// Compute the average of the array values
		sum = 0.0;
		for (int i = 0; i < N; i++){
			sum += c[i];			
		}
		double average  = sum / N;
		System.out.println("The average value of vector c is: " +average);

	// Copy array c[] to another array d[] 

		double [] d = new double[N];

		for (int i = 0; i < N; i++){
			d[i] = c[i];
		}


	// Check if c[i] == d[i] i.e. the copy was sucessful

		for (int i = 0; i < N; i++){
			if (c[i] == d[i]) System.out.println("Ok!");
			else System.out.println("Fail!");
		}

	// Reverse the elements in c[]
		System.out.println("Array c[] in reverse order:");
		
		for (int i = 0; i < N/2; i++){
			double temp = c[i];
			c[i] = c[N-1-i];
			c[N-1-i] = temp;	
		}

		for (int i = 0; i < N; i++){
			System.out.println(c[i]);
		}









	}
}