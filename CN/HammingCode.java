package CN;

import java.util.Scanner;

public class HammingCode {

    static void printCode(int[] code) {
        for (int i = 1; i < code.length; i++) {
            System.out.print(code[i]);
        }
        System.out.println();
    }

    static int[] generateHammingCode(String data, int m, int r) {
        int[] hammingCode = new int[m + r + 1];
        int dataIndex = 0;

        for (int i = 1; i < hammingCode.length; i++) {
            if ((i & (i - 1)) == 0) {
                hammingCode[i] = 0;  
            } else {
                hammingCode[i] = Character.getNumericValue(data.charAt(dataIndex++));
            }
        }

        return calculateRedundantBits(hammingCode, r);
    }

    static int[] calculateRedundantBits(int[] code, int r) {
        for (int i = 0; i < r; i++) {
            int position = 1 << i; 
            int parity = 0;
            
            System.out.print("r" + position + " covers positions: ");
            for (int j = 1; j < code.length; j++) {
                if ((j & position) != 0) {
                    parity ^= code[j];
                    System.out.print(j + " ");
                }
            }
            code[position] = parity;
            System.out.println("= " + parity);
        }
        return code;
    }

    static int calculateRedundantBitsCount(int m) {
        int r = 0;
        while ((1 << r) < (m + r + 1)) {
            r++;
        }
        return r;
    }

    static int detectError(int[] receivedCode) {
        int errorPosition = 0;
        int r = (int)(Math.log(receivedCode.length - 1) / Math.log(2)) + 1;

        for (int i = 0; i < r; i++) {
            int position = 1 << i;
            int parity = 0;

            for (int j = 1; j < receivedCode.length; j++) {
                if ((j & position) != 0) {
                    parity ^= receivedCode[j];
                }
            }

            if (parity != 0) {
                errorPosition += position;
            }
        }
        return errorPosition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the binary message: ");
        String data = scanner.nextLine();

        if (!data.matches("[01]+")) {
            System.out.println("Invalid Basics.input. Please enter a binary string (0s and 1s only).");
            scanner.close();
            return;
        }

        int m = data.length();
        int r = calculateRedundantBitsCount(m);

        System.out.println("Number of redundant bits: " + r);

        int[] hammingCode = generateHammingCode(data, m, r);

        System.out.println("\nGenerated Hamming code:");
        printCode(hammingCode);

        System.out.print("\nEnter the bit position to introduce an error (1-" + (hammingCode.length - 1) + ") or 0 for no error: ");
        int errorPos = scanner.nextInt();

        System.out.println("\nHamming Code sent by the sender: ");
        printCode(hammingCode);

        if (errorPos > 0 && errorPos < hammingCode.length) {
            hammingCode[errorPos] ^= 1;
            
            System.out.println("Hamming code with error:");
            printCode(hammingCode);
        } else if (errorPos != 0) {
            System.out.println("Invalid bit position. No error introduced.");
        }

        int errorDetected = detectError(hammingCode);
        if (errorDetected == 0) {
            System.out.println("No error detected in the received code.");
        } else {
            System.out.println("Error detected at position: " + errorDetected);
            hammingCode[errorDetected] ^= 1;
            System.out.println("Corrected Hamming code:");
            printCode(hammingCode);
        }

        scanner.close();
    }
}