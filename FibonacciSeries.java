public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the series
        System.out.println("Fibonacci Series with " + n + " terms:");
        
        int firstTerm = 0, secondTerm = 1;
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            
            // Compute the next term in the series
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
