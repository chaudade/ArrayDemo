/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;
/**
 *
 * @author Adeem
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*char[] myLetters = new char[5];
        myLetters[0] = 'A';
        myLetters[1] = 'd';
        myLetters[2] = 'e';
        myLetters[3] = 'e';
        myLetters[4] = 'm';
        
        for (int i = 0; i<myLetters.length; i++) {
            System.out.print(myLetters[i]);
        }*/
        
        System.out.print("Enter word: ");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        char[] myLetters = new char[myWord.length()];
        for (int i = 0; i < myLetters.length; i++){
            myLetters[i] = myWord.charAt(i);
            System.out.print(myLetters[i]);
        }
        System.out.println("Printing in reverse: ");
        for (int i = myLetters.length - 1; i >= 0; i--) {
            System.out.print(myLetters[i]);
        }
        
    }
    
}
