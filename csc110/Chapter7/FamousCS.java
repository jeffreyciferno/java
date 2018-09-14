package Chapter7;
//Program Name: FamousCS
//Author: Jeff Ciferno
//Class: CSC110ab
//Date: 11/1/2017
//Description: Printwriter to TXT

import java.io.*;

import java.util.Scanner;
public class FamousCS {
    public static void main(String[] args) throws IOException {
  
    	
    	
    	Scanner inFile = new Scanner(new
FileReader("src/chapter7/names.txt"));
        PrintWriter outFile = new
PrintWriter("src/chapter7/CSReport.txt");
        String line;
        String sFN;
        String sLN;
        String sW;
        
        
        while (inFile.hasNextLine()) {
            line = inFile.nextLine();
            Scanner tokens = new Scanner(line);
            tokens.useDelimiter(",");
            sLN = tokens.next();
            sFN = tokens.next();
            sW = tokens.next();
            outFile.println(sFN.charAt(0) + ". " + sLN + " "
+ sW + ".");
            tokens.close();
        }
        inFile.close();
        outFile.close();
    }}

