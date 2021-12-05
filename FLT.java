package Project2;
//Fermat's Little Theorem
//Code taken from geeksforgeeks : https://www.geeksforgeeks.org/primality-test-set-2-fermet-method/?ref=lbp
public class FLT {
	 // If n is prime, then always returns true,  
     // If n is composite than returns false with  
     // high probability Higher value of k increases 
     //  probability of correct result. 
	int arr[];
	int comparisons = 0;
	int amt = 0;
    long nano_TotalTime = 0;
	long nano_startTime;
	long nano_endTime;
	String dataset;
	
	public FLT(int incArr[], int n, String data) {
		arr = incArr;
		amt = n;
		dataset = data;
		nano_startTime = System.nanoTime();
		for (int i = 0; i < amt; i++) {
			//System.out.println("The number at i is  : " + arr[i]);
			//System.out.println("Is it prime : " + isPrime(arr[i]));
			isPrime(arr[i], arr[i] / 5);
		}
		nano_endTime = System.nanoTime() - nano_startTime;
		
	}
	public String toString() {
		return "After " + amt + " iterations of the Fermat's Little Theorem algorithm on the data set : " + dataset + ", it took " + nano_endTime + " nanoseconds and " + comparisons + " total comparisons.";
	}

     boolean isPrime(int n, int k) 
    { 
    // Corner cases 
    if (n <= 1 || n == 4) {
    	comparisons++;
    	return false; 
    }
    if (n <= 3) {
    	comparisons++;
    }
      
    // Try k times 
    while (k > 0) 
    { 
    	comparisons++;
        // Pick a random number in [2..n-2]      
        // Above corner cases make sure that n > 4 
        int a = 2 + (int)(Math.random() % (n - 4));  
      
        // Fermat's little theorem 
        if (power(a, n - 1, n) != 1) {
        	comparisons++;
            return false; 
        }
      
        k--; 
        } 
      
        return true; 
    } 
     int power(int a,int n, int p) 
    { 
        // Initialize result 
        int res = 1; 
          
        // Update 'a' if 'a' >= p 
        a = a % p;  
      
        while (n > 0) 
        { 
        	comparisons++;
            // If n is odd, multiply 'a' with result 
            if ((n & 1) == 1) {
            	comparisons++;
                res = (res * a) % p; 
            }
      
            // n must be even now 
            n = n >> 1; // n = n/2 
            a = (a * a) % p; 
        } 
        return res; 
    } 
}
