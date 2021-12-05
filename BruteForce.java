package Project2;

public class BruteForce {
	int arr[];
	int comparisons = 0;
	int amt = 0;
    long nano_TotalTime = 0;
	long nano_startTime;
	long nano_endTime;
	String dataset;

	
	public BruteForce(int incArr[], int n, String data) {
		arr = incArr;
		amt = n;
		dataset = data;
		nano_startTime = System.nanoTime();
		for (int i = 0; i < amt; i++) {
			//System.out.println("The number at i is  : " + arr[i]);
			//System.out.println("Is it prime : " + isPrime(arr[i]));
			isPrime(arr[i]);
		}
		nano_endTime = System.nanoTime() - nano_startTime;
		
	}
	
	
	public String toString() {
		return "After " + amt + " iterations of the brute force algorithm on the data set : " + dataset + ", it took " + nano_endTime + " nanoseconds and " + comparisons + " total comparisons.";
	}


	
	 boolean isPrime(int n)
			{ 
		    // Brute force algorithm O(n), taken from geeksforgeeks.org
		    //https://www.geeksforgeeks.org/primality-test-set-2-fermet-method/?ref=lbp
	        // Corner case 
	        if (n <= 1) {
	        	comparisons++;
	        	return false; 
	        }
	      
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++)  {
	        	comparisons++;
	            if (n % i == 0) {
	            	comparisons++;
	                return false;
	            }
	            
	        }
	        return true; 
	    } 
}
