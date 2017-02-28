package com.wingspan.interview;

public class MysteryQuestion { // Creating a Class named MysteryQuestions
    public static String function(String s) {// Declaring a function that takes a string argument and returns a string
        if (s.length() != 10) { //Checking if the lenght of the string is eual to 10
            throw new RuntimeException();// if true trow an error
        }

        StringBuffer sb = new StringBuffer(); // Declaring a new string buffer
        for (int i = 0; i < 10; i++) { // Creating a For loop
            if (i == 0) {  // checking if i == 0
                sb.append('(');// if true add '(' into the sb StringBuffer
            } else if (i == 3) {// checking for i == 3
                sb.append(')'); // if true add ')' to sb
            } else if (i == 6) { // when i == 6 add - to the sb StringBuffer
                sb.append('-');
            }

            char c = s.charAt(i); // Declaring a character variable c with elements from string s
            if (Character.isDigit(c)) {// checking if the element of c is  a digit
                sb.append(c);// if true add it to c
            } else if (Character.isLetter(c)) {// else if character
                char c1 = (char) (Character.toLowerCase(c) - 'a'); // convert it to lower case and assign it to c1
                char c2 = (char) (((int) '2') + (c1 / 3));// converting the charater to int after dividing it by 3 and assigning the value to c2
                sb.append(c2);// adding c2 to sb
            } else {
                throw new RuntimeException();//if all conditions above false throw an error
            }
        }

        return sb.toString();// return the sb string buffer after converting it to string.
    }
}
