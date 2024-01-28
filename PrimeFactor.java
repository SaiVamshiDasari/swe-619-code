

public class PrimeFactor {

    public static int findPrimeFactor(int[] listA, int[] listB) {
        for (int i = 0; i < listA.length; i++) {
            if (listB[i] > 1 && listA[i] % listB[i] == 0 && isPrime(listB[i])) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) { //here we used the math.sqrt to minimize the compile time the ways of doing it is using (i<n 0r i<n/2)
            if (n % i == 0) return false; 
        }
        return true;
    }

//this is the testing code
    public static void main(String[] args) {
        int[] listA = {12, 25, 18, 8};
        int[] listB = {6, 2, 3, 2};
        
        int index = findPrimeFactor(listA, listB);
        
        if (index != -1) {
            System.out.println("\n Index of the first prime factor in listA: " + index+"\n");
        } else {
            System.out.println("No prime factor found in listA.");
        }
    }
}
