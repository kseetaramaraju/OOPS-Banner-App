package org.example;

/**
 * OOPSBannerApp renders the word OOPS in banner format
 * using space and '*' characters.
 *
 * UC4: Character pattern data is encapsulated inside an inner class
 * to separate data representation from rendering logic.
 *
 * @author seetharamaraju
 * @version 4.0
 */


public class OOPSBannerApp {
    /**
     * Inner class to encapsulate a character and its banner pattern.
     * This class is immutable and follows encapsulation principles.
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         *
         * @param character the banner character
         * @param pattern   the banner pattern rows
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return the banner character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * @return the banner pattern rows
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Builds all character-pattern mappings required for the banner.
     *
     * @return array of CharacterPatternMap objects
     */
    static CharacterPatternMap[] buildCharacterPatterns() {

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };
    }

    /**
     * Prints the banner using character-pattern objects.
     *
     * @param patterns array of CharacterPatternMap objects
     */
    static void printBanner(CharacterPatternMap[] patterns) {

        int height = patterns[0].getPattern().length;

        for (int row = 0; row < height; row++) {
            String line = "";

            for (CharacterPatternMap patternMap : patterns) {
                line = line + patternMap.getPattern()[row] + "   ";
            }

            System.out.println(line);
        }
    }

    /**
     * Returns banner pattern for character 'O'
     *
     * @return String array representing 'O'
     */
    static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    /**
     * Returns banner pattern for character 'P'
     *
     * @return String array representing 'P'
     */
    static String[] getPPattern() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    /**
     * Returns banner pattern for character 'S'
     *
     * @return String array representing 'S'
     */
    static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    /**
     * Main method – Program entry point
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = buildCharacterPatterns();
        printBanner(patterns);
    }
}
