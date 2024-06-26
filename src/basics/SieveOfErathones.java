package basics;
// to count no of primes
// mark all as prime then check table of that no if the no exist in that table mark it as prime
public class SieveOfErathones {
    public int countPrimes(int n) {

        boolean[] notprime = new boolean[n];
        int count=0;

        for(int i=2;i<n;i++){
            if(notprime[i]==false){

                count++;
                for(int j=1;i*j<n;j++){
                    notprime[i*j] = true;
                }
            }
        }
        return count;
    }
}
