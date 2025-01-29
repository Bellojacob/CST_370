package practice;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // accept user input of a string
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        // create an array called list to contain the entered word in the array
        String[] list = word.split("");

        // verify our array is correct
        // for(int i=0; i < word.length(); i++){
        //     System.out.println(list[i]);
        // }

        int length = word.length();

        int middle = length/2;

        boolean isValid = true;

        for(int i = 0; i < middle; i++){
            if (list[i].equals(list[length - 1 - i])) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("True! Is Palindrome");
        } else{
            System.out.println("False :( Is NOT Palindrome");
        }
    }
}
