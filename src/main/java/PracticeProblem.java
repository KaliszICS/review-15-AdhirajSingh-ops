public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int goodString(String s) {
    int n = s.length();
    int minOperations = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
        for (int j = n - 1; j > i; j--) {
            if (s.charAt(i) == s.charAt(j)) {
                int operations = i + (n - 1 - j);
                minOperations = Math.min(minOperations, operations);
            }
        }
    }

    if (minOperations == Integer.MAX_VALUE) {
        return -1;
    }

    return minOperations;
}

}


