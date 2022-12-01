/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringandarrays;

import java.util.Scanner;

/**
 *
 * @author Umman
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("metni daxil edin");

        String s = sc.nextLine();

        int i = s.length();
        System.out.println("length=" + i);

        char c2 = s.charAt(s.length() - 1);
        System.out.println("last symbol=" + c2);

        String substring = s.substring(1, 3);
        System.out.println("substring=" + substring);

        boolean b = s.contains("Lan");
        System.out.println("contains=" + b);

        boolean b2 = s.equals("Java Language");
        System.out.println("equals=" + b2);

        boolean b22 = s.equalsIgnoreCase("java language");
        System.out.println("equals ignore case=" + b22);

        boolean b3 = s.isEmpty();
        System.out.println("is empty=" + b3);

        boolean b4 = s.startsWith("Java");
        System.out.println("starts with=" + b4);

        boolean b5 = s.endsWith("age");
        System.out.println("ends with=" + b5);

        String ss = s.trim();
        System.out.println("trim=" + ss);

        String lower = s.toLowerCase();
        System.out.println("lower=" + lower);

        String upper = s.toUpperCase();
        System.out.println("upper=" + upper);

        int index = s.indexOf("LAN");
        System.out.println("index of lan=" + index);

        int lastIndex = s.lastIndexOf("A");
        System.out.println("last index=" + lastIndex);

        String replace = s.replace("Java", "Hello world");
        System.out.println("replace=" + replace);

    }

}
