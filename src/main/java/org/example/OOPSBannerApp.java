package org.example;

/**
 * OOPSBannerApp UC2 - Render OOPS as Banner (spaces and *)
 *
 * This Class demostrates the creation of ASSCII art banner using Object-Oriented Programming Principles
 * It extends the basic banner concept by displaying the word "OOPS" in a visual format using asterisks(*)
 * and spaces to form each letter
 *
 *
 *
 * @author seetharamaraju
 * @version 2.0
 */

/**
 *  Extend the User Story 1 to display the message "OOPS" in a banner format
 *  Using characters formed by spaces and asterisks(*) to create a visual
 *  effect for each letter in the message.
 */
public class OOPSBannerApp {
    // Main Method to run the banner display
    public static void main(String[] args) {

        // Define String Array variable to hold the oops banner lines
        // Each line represents a row in the banner for the letters O,O,P,S
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Banner height is 7
        for (int i = 0; i < 7; i++) {
            String line = String.join("   ",
                    O[i], O[i], P[i], S[i]);
            System.out.println(line);
        }

    }


}
