import java.util.HashMap;
import java.util.Map;

/**
 * BannerDisplay
 * Demonstrates use of HashMap (Collections Framework)
 * to manage ASCII character patterns in a modular and reusable way.
 */
public class UC8 {

    // HashMap to store character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    /**
     * Initializes and loads character patterns into HashMap
     */
    public static void generatePatterns() {

        patternMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        patternMap.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        patternMap.put('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });
    }

    /**
     * Retrieves pattern for a given character
     *
     * @param ch Character to retrieve
     * @return ASCII pattern array
     */
    public static String[] getPattern(char ch) {
        return patternMap.getOrDefault(ch, new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        });
    }

    /**
     * Displays banner message
     *
     * @param message The message to display
     */
    public static void displayMessage(String message) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getPattern(ch);
                lineBuilder.append(pattern[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {

        // Generate patterns
        generatePatterns();

        // Display the message "OOPS"
        displayMessage("OOPS");
    }
}