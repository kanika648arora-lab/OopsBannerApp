public class UC4 {

    public static void main(String[] args) {

        // Define a String array to store each banner line
        String[] lines = new String[7];

        // Populate the array using String.join()
        lines[0] = String.join("", "  *   ", "  ***  ");
        lines[1] = String.join("", " *   *  ", " *     * ");
        lines[2] = String.join("", "*     * ", "*       *");
        lines[3] = String.join("", "*     * ", "*       *");
        lines[4] = String.join("", "*     * ", "*       *");
        lines[5] = String.join("", " *   *  ", " *     * ");
        lines[6] = String.join("", "  *   ", "  ***  ");

        // Use a for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}