package com.company.chess.run;

import com.company.chess.models.Board.ChessBoard;
import com.google.gson.Gson;
import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by guna on 15/06/18.
 */
public class Temp {
    private static final Scanner scanner = new Scanner(System.in);

    //Scanner
    public static void main(String args[]) throws Exception {
        //  Sample code to perform I/O:
        //   Use either of these methods for input

        // //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        String a = scanner.nextLine();                 // Reading input from STDIN
        int numberOfTestCases = Integer.parseInt(a);// Writing output to STDOUT


        for (int i = 0; i < numberOfTestCases; i++) {
            HashSet hashSet = new HashSet();
            String desert = scanner.nextLine();
            String[] lineItems = scanner.nextLine().split(" ");
            // Reading input from STDIN
            int x = Integer.parseInt(lineItems[0]);
            int r = Integer.parseInt(lineItems[1]);
            System.out.println(calculate(desert, x, r));
        }


    }


    private static String calculate(String a, int x, int r) {
        String rotated = a.substring(a.length() - r, a.length()) + a.substring(0, a.length()- r);

        for (int i = 0; i < rotated.length(); i++) {
            if(i%2 !=0) {
                char c = a.charAt(i);
                int num = Integer.parseInt(String.valueOf(c));
                num = num + x;
                num = num %10;
                rotated.replace(c, (char)num);
            }
        }
        return rotated;
    }


    /*
    sample input
    1
    31
    4 1

    13
     */
}



