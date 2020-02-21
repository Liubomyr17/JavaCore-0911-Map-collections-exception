package com.company;

/*

0911 Map collections exception
Catch the exception (and display it), indicating its type that occurs when the code is executed:
HashMap <String, String> map = new HashMap <String, String> (null);
map.put (null, null);
map.remove (null);

Requirements:
1. The program should display a message on the screen.
2. The program should have a try-catch block.
3. The program should catch exceptions of a specific type, and not all possible ones (Exception).
4. The output message should contain the type of exception that occurred.
5. Do not delete existing code in the main method.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}





