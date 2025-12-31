package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp renders the word OOPS in banner format
 * using a Map for character pattern lookup.
 * <p>
 * UC5: Uses HashMap and StringBuilder to simplify
 * and scale banner rendering logic.
 *
 * @author seetharamaraju
 * @version 5.0
 */


public class OOPSBannerApp {
    /**
     * Builds and returns a map of character patterns.
     *
     * @return Map of Character to String[] banner patterns
     */
    static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Prints the banner for the given word using pattern map.
     *
     * @param word       String to be rendered as banner
     * @param patternMap Map containing character patterns
     */
    static void printBanner(String word, Map<Character, String[]> patternMap) {

        int height = patternMap.get(word.charAt(0)).length;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[row]).append("   ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method – Program entry point
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        String word = "OOPS";

        printBanner(word, patternMap);
    }

}
