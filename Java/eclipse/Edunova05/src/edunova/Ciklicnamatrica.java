package edunova;
import javax.swing.JOptionPane;


public class Ciklicnamatrica {

    public static void main(String[] args) {

        boolean dev = true;

        int redova = dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
        int stupci = dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));

        int[][] matrica = new int[redova][stupci];

        // Print initial matrix
        for (int i = 0; i < redova; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("1.********************************");

        int b = 1;

        // Fill the last row in reverse order
        for (int i = 1; i <= stupci; i++) {
            matrica[redova - 1][stupci - i] = b++;
        }

        // Print matrix after filling the last row
        for (int i = 0; i < redova; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("2.********************************");

        // Fill the first column from the bottom up
        for (int i = 2; i <= redova; i++) {
            matrica[redova - i][0] = b++;
        }

        // Print matrix after filling the first column
        for (int i = 0; i < redova; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("3.********************************");

        // Fill the first row from the second column onwards
        for (int i = 1; i < stupci; i++) {
            matrica[0][i] = b++;
        }

        // Print matrix after filling the first row
        for (int i = 0; i < redova; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("4********************************");

        // Fill the last column from the second row to the second-to-last row
        for (int i = 1; i < redova - 1; i++) {
            matrica[i][stupci - 1] = b++;
        }

        // Print matrix after filling the last column
        for (int i = 0; i < redova; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("********************************");

        // Fill the second-to-last row from the second-to-last column to the second column
        for (int i = 2; i < stupci; i++) {
            matrica[redova - 2][stupci - i] = b++;
        }

        // Print matrix after filling the second-to-last row
        for (int i = 0; i < redova; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("*********************");

        // Fill specific cells
        matrica[2][1] = b++;
        matrica[1][1] = b++;

        // Fill the remaining cells in the third column
        for (int i = 3; i < redova; i++) {
            matrica[i][stupci - 3] = b++;
        }

        // Print final matrix
        for (int i = 0; i < redova; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.print(matrica[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("*********************");

        // Additional code can be added here if needed

    }
}