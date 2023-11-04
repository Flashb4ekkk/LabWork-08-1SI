package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("String contained " + count(str) + " groups of 'AGA' and 'OGO'");
        System.out.println("Modified string (param):  " + str);
        System.out.println("Modified string (result): " + replaceOGOandAGA(str));
    }

    public static int count(String str) {
        int k = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if ((str.charAt(i) == 'O' && str.charAt(i + 1) == 'G' && str.charAt(i + 2) == 'O') ||
                    (str.charAt(i) == 'A' && str.charAt(i + 1) == 'G' && str.charAt(i + 2) == 'A')) {
                k++;
            }
        }
        return k;
    }

    public static String replaceOGOandAGA(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if (i < str.length() - 2 && ((str.charAt(i) == 'O' && str.charAt(i + 1) == 'G' && str.charAt(i + 2) == 'O') ||
                    (str.charAt(i) == 'A' && str.charAt(i + 1) == 'G' && str.charAt(i + 2) == 'A'))) {
                sb.append("**");
                i += 2;
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
