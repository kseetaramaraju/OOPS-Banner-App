package org.example;

/**
 * OOPSBannerApp - OOPS Banner Application (Use Case 3)
 *
 * This class extends User Story 2 to display the "OOPS" banner using a modular approach
 * by implementing the Single Responsibility Principle (SRP) and Method Extraction.
 *
 * String arrays representing ASCII art for letters O, P, and S are generated
 * and combined horizontally to create the visual "OOPS" message.
 *
 * @author seetharamaraju
 * @version 3.0
 */


public class OOPSBannerApp {
    // Main Method to run the banner display
    public static void main(String[] args) {

        String[][] banner = buildPattern();
        printPattern(banner);
    }

    // Builds the complete OOPS banner pattern
    static String[][] buildPattern() {
        return new String[][]{
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };
    }

    // Prints the banner line by line
    static void printPattern(String[][] banner) {
        for (int row = 0; row < banner[0].length; row++) {
            String line = "";

            for (String[] letter : banner) {
                line = line + letter[row] + "   ";
            }

            System.out.println(line);
        }
    }

    // Pattern for letter O
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

    // Pattern for letter P
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

    // Pattern for letter S
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
}
