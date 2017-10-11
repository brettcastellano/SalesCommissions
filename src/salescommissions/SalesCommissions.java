/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salescommissions;

/**
 *
 * @author brcas1396
 */
public class SalesCommissions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = 200;
        int[] grossSales = {4000, 2000, 950, 1500, 3000, 800, 8000};
        int[] frequency = new int[8];

        for (int counter = 0; counter < grossSales.length; counter++) {
            if (min + (0.09 * grossSales[counter]) > 200 && min + (0.09 * grossSales[counter]) < 300) {
                ++frequency[0];
            } else if (min + (0.09 * grossSales[counter]) > 300 && min + (0.09 * grossSales[counter]) < 400) {
                ++frequency[1];
            } else if (min + (0.09 * grossSales[counter]) > 400 && min + (0.09 * grossSales[counter]) < 500) {
                ++frequency[2];
            } else if (min + (0.09 * grossSales[counter]) > 500 && min + (0.09 * grossSales[counter]) < 600) {
                ++frequency[3];
            } else if (min + (0.09 * grossSales[counter]) > 600 && min + (0.09 * grossSales[counter]) < 700) {
                ++frequency[4];
            } else if (min + (0.09 * grossSales[counter]) > 700 && min + (0.09 * grossSales[counter]) < 800) {
                ++frequency[5];
            } else if (min + (0.09 * grossSales[counter]) > 800 || min + (0.09 * grossSales[counter]) < 900) {
                ++frequency[6];
            } else if (min + (0.09 * grossSales[counter]) > 300 || min + (0.09 * grossSales[counter]) < 400) {
                ++frequency[7];
            }
        }

        for (int rating = 0; rating < frequency.length; rating++) {
            System.out.printf("%6d-%2d%10d%n", min, min + 99, frequency[rating]);
            min += 100;
        }
    }

}
