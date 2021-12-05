package Project2;
//Code taken from https://www.tutorialspoint.com/Sieve-of-Eratosthenes-in-java
//Code by George John
public class Sieve {
	int arr[];
	int comparisons = 0;
	int amt = 0;
    long nano_TotalTime = 0;
	long nano_startTime;
	long nano_endTime;
	String dataset;

	
	public Sieve(int incArr[], int n, String data) {
		arr = incArr;
		amt = n;
		dataset = data;
		nano_startTime = System.nanoTime();
		for (int i = 0; i < amt; i++) {
			sieveOfE(arr[i]);
		}
		nano_endTime = System.nanoTime() - nano_startTime;
		
	}
	
	public void sieveOfE(int num) {
	    boolean[] bool = new boolean[num];
	      
	      for (int i = 0; i< bool.length; i++) {
	         bool[i] = true;
	      }
	      for (int i = 2; i< Math.sqrt(num); i++){
	         if(bool[i] == true) {
	        	 comparisons++;
	            for(int j = (i*i); j<num; j = j+i) {
	               bool[j] = false;
	            }
	         }
	      }
	      /*
	      System.out.println("List of prime numbers upto given number are : ");
	      for (int i = 2; i< bool.length; i++) {
	         if(bool[i]==true) {
	            System.out.println(i);
	         }
	      }
	      */
	   }
	
	
	
	public String toString() {
		return "After " + amt + " iterations of the Sieve Of Eratosthenes algorithm on the data set : " + dataset + ", it took " + nano_endTime + " nanoseconds and " + comparisons + " total comparisons.";
	}


}
