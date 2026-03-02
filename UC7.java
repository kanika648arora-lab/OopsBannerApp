/**
 * UC7 - Banner Display Program
 * Demonstrates Inner Static Class, Encapsulation, Abstraction,
 * Reusability, Separation of Concerns and other OOPS principles.
 */
public class UC7 {

    /**
     * Inner Static Class
     * Encapsulates a character and its 7-line pattern.
     */
    public static class CharacterPatternMap {

        /** Character to display */
        private final char character;

        /** Pattern corresponding to the character */
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character The character
         * @param pattern   The 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         *
         * @return character stored
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for character pattern
         *
         * @return 7-line pattern array
         */
        public String[] getCharacterPattern() {
            return pattern;
        }
    }

    /**
     * Builds pattern for letter O
     *
     * @return String array representing O
     */
    public static String[] buildO() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    /**
     * Builds pattern for letter P
     *
     * @return String array representing P
     */
    public static String[] buildP() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    /**
     * Builds pattern for letter S
     *
     * @return String array representing S
     */
    public static String[] buildS() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Arrays of Objects (CharacterPatternMap)
        CharacterPatternMap[] bannerCharacters = {
                new CharacterPatternMap('O', buildO()),
                new CharacterPatternMap('O', buildO()),
                new CharacterPatternMap('P', buildP()),
                new CharacterPatternMap('S', buildS())
        };

        // Display banner using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap map : bannerCharacters) {
                lineBuilder.append(map.getCharacterPattern()[row])
                           .append("  ");
            }

            System.out.println(lineBuilder);
        }
    }
}