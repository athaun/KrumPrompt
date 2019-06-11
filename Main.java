import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
 public static void main(String[] args) throws Exception {
   boolean looping = true;
   Methods.clearScreen();
   Methods.textArt();
   Methods.osCheck();

   while (looping) {
     String input = Methods.input(">>>");
     Methods.runCommand(input);
     InputMethods.commands(input);
   }
 }
}
