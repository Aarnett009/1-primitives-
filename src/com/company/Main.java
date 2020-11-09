package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Prints my name (Every Java program starts with the main function.)
//        Each time code is edited, use git hub in command line > Stash > Master > Push **Always go into detail
//        About what it is that you corrected in the code. If you feel the code is better/right, commit push.
        /*Line One
         * Line Two
         * Primitive is the most basic type that is built into a language.
         *String=type name=(Whatever you want to call it) value= Andrew
         * Adding final before string on a line of code makes it so the value can never be changed by other devs
         * or self.
         * (String Concatenation) Combining values in a string. **Ex. Name, Weight, and Age. (Combining)
         * (Char) Using Char takes less amount of memory than string. Keep in mind when on limited resources
         *(Way to commit in command line is **(git add . + git commit -m "Message"
         *
         *
         *  */
        String  myName = "Andrew";
        System.out.println("My name is " + myName);
        myName = "Furb";

        int myAge = 32;
        System.out.println("my name is  " + myName + " and my age is " + myAge);

        double myWeight = 225.2;
        System.out.println("My name is " + myName + " and my age is " + myAge + " and my fat ass weighs " + myWeight);

        char favLetter = 'D';
        System.out.println("My name is " + myName + " and my favorite letter is " + favLetter);
    }

}
