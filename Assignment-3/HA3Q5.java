public class HA3Q5 {
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
        } else {
            solveHanoi(n - 1, source, auxiliary, destination);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            solveHanoi(n - 1, auxiliary, destination, source);
        }
    }

    public static void main(String[] args) {
        int n = 4; // Number of disks
        char source = 'A'; // Source peg
        char destination = 'C'; // Destination peg
        char auxiliary = 'B'; // Auxiliary peg

        solveHanoi(n, source, destination, auxiliary);
    }
}
