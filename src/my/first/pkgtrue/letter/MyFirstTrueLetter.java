/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.first.pkgtrue.letter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class MyFirstTrueLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arl = new ArrayList<>();
        String[] s = new String[5];
        char[] c = new char[100];

        for (int i = 0; i < 5; i++) {
            s[i] = sc.nextLine();

        }

        for (int i = 0; i < 5; i++) {
            c = s[i].toCharArray();
            arl.clear();
            for (int j = 0; j < s[i].length(); j++) {
                if (arl.contains(c[j]) == false) {
                    arl.add(c[j]);
                }
                
            }
            System.out.println(arl);
        }
    }

}
