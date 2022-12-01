/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringandarrays;

import java.util.Scanner;

/**
 *
 * @author Umman
 */
public class Arrays {

    public static void main(String[] args) {
//        coxsiraliArray();

//        birsiraliArray();

//        boolean b = detectSymmetry("sol"); // sozun tersi ile duzunu yoxlamaq
//        System.out.println("b=" + b);

        bosluqSilmek();

    }

    public static String bosluqSilmek() {
//        String s = "      Salam        necesen       ay     brat   ";
        Scanner sc = new Scanner(System.in);
        System.out.println("metni daxil edin");

        String s = sc.nextLine();

        String[] arr = s.split(" ");
        String netice = "";//Salam
        for (int i = 0; i < arr.length; i++) {
            String elem = arr[i];

            if (!elem.isEmpty()) {
                netice += elem + " ";
            }
        }

        netice = netice.trim();
        System.out.println("netice=" + netice);
        return null;
    }

    public static boolean detectSymmetry(String s) {
        // sozun tersi ile duzunu yoxlamaq

        for (int i = 0; i < s.length(); i++) {
            char sag = s.charAt(i);
            char sol = s.charAt(s.length() - 1 - i);
            System.out.println("===========");
            System.out.println("sag=" + sag);
            System.out.println("sol=" + sol);
            if (sag != sol) {
                return false;
            }
        }
        return true;
    }

    public static void coxsiraliArray() {
        int[][] arr = new int[2][5];// => {0, 0, 0, 0, 0}

        System.out.println("daxil edilme");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("i=" + i + ",j=" + j + ".ededi daxil edin");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("cap edilme");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("i=" + i + "," + "j=" + j + "." + arr[i][j]);
            }
        }
    }

    public static void birsiraliArray() {
        int[] arr = new int[5];// => {0, 0, 0, 0, 0}

        System.out.println("daxil edilme");

        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(i + ".ededi daxil edin");
            arr[i] = sc.nextInt();
        }
        System.out.println("cap edilme");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "." + arr[i]);
        }
    }

}
