package chapter1;
/*
ID: alan.bi1
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.*;

class ride {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("ride.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));


        String comet = f.readLine();
        String group = f.readLine();

        int ctotal = 1;
        int gtotal = 1;

        for (int i = 0; i < comet.length(); i++) {
            ctotal *= comet.charAt(i) - 64;
        }

        for (int i = 0; i < group.length(); i++) {
            gtotal *= group.charAt(i) - 64;
        }

        if (ctotal % 47 == gtotal % 47) {
            out.println("GO");
        } else {
            out.println("STAY");
        }
        out.close();
    }
}