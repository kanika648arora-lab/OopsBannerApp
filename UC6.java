public class UC6
 {
    // Method to build letter O
    public static String[] buildO() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }
    // Method to build letter P
    public static String[] buildP() {
        return new String[]{
                String.join("", " ******  "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", " ******  "),
                String.join("", " *       "),
                String.join("", " *       "),
                String.join("", " *       ")
        };
    }
    // Method to build letter S
    public static String[] buildS() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", " *       "),
                String.join("", "  *****  "),
                String.join("", "       * "),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }
    public static void main(String[] args) {

        // Call methods at array declaration
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Combine banner lines (7 lines total)
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = O[i] + "  " + P[i] + "  " + S[i];
        }

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}