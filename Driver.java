package Project2;
import java.util.Random;
public class Driver {
	public static void main(String[] args) {
		Random rand = new Random();
		int randArr[] = new int[10000];
		int primeArr[] = new int[10000];
		int evenArr[] = new int[10000];
		//Since our project is using the sieve of Eratosthenes algorithm, we should use it to populate our prime array!
		//The 10000th prime number is 104729, so if we set the n to 104730 we should be able to completely populate the 10000 prime array
		sieveOfEratosthenes(104730, primeArr);
		for (int i = 0; i < randArr.length; i++) {
			randArr[i] = rand.nextInt(10000);
			//Any number multiplied by 2 is even, so just multiply the random number by 2.
			evenArr[i] = rand.nextInt(10000) * 2;
		}
		
		// Brute Force
		
		BruteForce bfAlgRand10 = new BruteForce(randArr, 10, "Random Integers");
		BruteForce bfAlgRand100 = new BruteForce(randArr, 100, "Random Integers");
		BruteForce bfAlgRand1000 = new BruteForce(randArr, 1000, "Random Integers");
		BruteForce bfAlgRand10000 = new BruteForce(randArr, 10000, "Random Integers");
		BruteForce bfAlgEven10 = new BruteForce(evenArr, 10, "Even Integers");
		BruteForce bfAlgEven100 = new BruteForce(evenArr, 100, "Even Integers");
		BruteForce bfAlgEven1000 = new BruteForce(evenArr, 1000, "Even Integers");
		BruteForce bfAlgEven10000 = new BruteForce(evenArr, 10000, "Even Integers");
		BruteForce bfAlgPrime10 = new BruteForce(primeArr, 10, "Prime Integers");
		BruteForce bfAlgPrime100 = new BruteForce(primeArr, 100, "Prime Integers");
		BruteForce bfAlgPrime1000 = new BruteForce(primeArr, 1000, "Prime Integers");
		BruteForce bfAlgPrime10000 = new BruteForce(primeArr, 10000, "Prime Integers");

		System.out.println("BRUTE FORCE \nRANDOM INTEGERS \n" + bfAlgRand10.toString());
		System.out.println(bfAlgRand100.toString());
		System.out.println(bfAlgRand1000.toString());
		System.out.println(bfAlgRand10000.toString());
		System.out.println("\nEVEN INTEGERS \n" + bfAlgEven10.toString());
		System.out.println(bfAlgEven100.toString());
		System.out.println(bfAlgEven1000.toString());
		System.out.println(bfAlgEven10000.toString());
		System.out.println("\nPRIME INTEGERS \n" + bfAlgPrime10.toString());
		System.out.println(bfAlgPrime100.toString());
		System.out.println(bfAlgPrime1000.toString());
		System.out.println(bfAlgPrime10000.toString());
		
		Sieve sieveAlgRand10 = new Sieve(randArr, 10, "Random Integers");
		Sieve sieveAlgRand100 = new Sieve(randArr, 100, "Random Integers");
		Sieve sieveAlgRand1000 = new Sieve(randArr, 1000, "Random Integers");
		Sieve sieveAlgRand10000 = new Sieve(randArr, 10000, "Random Integers");
		Sieve sieveAlgEven10 = new Sieve(evenArr, 10, "Even Integers");
		Sieve sieveAlgEven100 = new Sieve(evenArr, 100, "Even Integers");
		Sieve sieveAlgEven1000 = new Sieve(evenArr, 1000, "Even Integers");
		Sieve sieveAlgEven10000 = new Sieve(evenArr, 10000, "Even Integers");
		Sieve sieveAlgPrime10 = new Sieve(primeArr, 10, "Prime Integers");
		Sieve sieveAlgPrime100 = new Sieve(primeArr, 100, "Prime Integers");
		Sieve sieveAlgPrime1000 = new Sieve(primeArr, 1000, "Prime Integers");
		Sieve sieveAlgPrime10000 = new Sieve(primeArr, 10000, "Prime Integers");
		
		// Sieve of Eratosthenes
		
		System.out.println("\nSIEVE OF ERATOSTHENES\nRANDOM INTEGERS\n" + sieveAlgRand10.toString());
		System.out.println(sieveAlgRand100.toString());
		System.out.println(sieveAlgRand1000.toString());
		System.out.println(sieveAlgRand10000.toString());
		System.out.println("\nEVEN INTEGERS\n" + sieveAlgEven10.toString());
		System.out.println(sieveAlgEven100.toString());
		System.out.println(sieveAlgEven1000.toString());
		System.out.println(sieveAlgEven10000.toString());
		System.out.println("\nPRIME INTEGERS\n" + sieveAlgPrime10.toString());
		System.out.println(sieveAlgPrime100.toString());
		System.out.println(sieveAlgPrime1000.toString());
		System.out.println(sieveAlgPrime10000.toString());
		
		// Fermat's Little Theorem
		
		FLT fltAlgRand10 = new FLT(randArr, 10, "Random Integers");
		FLT fltAlgRand100 = new FLT(randArr, 100, "Random Integers");
		FLT fltAlgRand1000 = new FLT(randArr, 1000, "Random Integers");
		FLT fltAlgRand10000 = new FLT(randArr, 10000, "Random Integers");
		System.out.println("\nFERMAT'S LITTLE THEOREM \nRANDOM INTEGERS \n" + fltAlgRand10.toString());
		System.out.println(fltAlgRand100.toString());
		System.out.println(fltAlgRand1000.toString());
		System.out.println(fltAlgRand10000.toString());
		FLT fltAlgEven10 = new FLT(evenArr, 10, "Even Integers");
		FLT fltAlgEven100 = new FLT(evenArr, 100, "Even Integers");
		FLT fltAlgEven1000 = new FLT(evenArr, 1000, "Even Integers");
		FLT fltAlgEven10000 = new FLT(evenArr, 10000, "Even Integers");
		System.out.println("\nEVEN INTEGERS \n" + fltAlgEven10.toString());
		System.out.println(fltAlgEven100.toString());
		System.out.println(fltAlgEven1000.toString());
		System.out.println(fltAlgEven10000.toString());
		FLT fltAlgPrime10 = new FLT(primeArr, 10, "Prime Integers");
		FLT fltAlgPrime100 = new FLT(primeArr, 100, "Prime Integers");
		FLT fltAlgPrime1000 = new FLT(primeArr, 1000, "Prime Integers");
		FLT fltAlgPrime10000 = new FLT(primeArr, 10000, "Prime Integers");
		System.out.println("\nPRIME INTEGERS \n" + fltAlgPrime10.toString());
		System.out.println(fltAlgPrime100.toString());
		System.out.println(fltAlgPrime1000.toString());
		System.out.println(fltAlgPrime10000.toString());



	}
    static void sieveOfEratosthenes(int n, int[] arr) 
    { 
        // Create a boolean array "prime[0..n]" and initialize 
        // all entries it as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
    	int count = 0;
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false;
            } 
        } 
          
        // Print all prime numbers 
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) { 
            	arr[count++] = i;
                //System.out.print(i + " "); 
            }
        } 
    } 

}
