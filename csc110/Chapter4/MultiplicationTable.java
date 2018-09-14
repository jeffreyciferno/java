

/*
Program Name : MultiplicationTable.java
Author :
Date :
Class: CSC110AA/AB and CIS163AA
Description:

This program prompts the user for a number 1 - 5,
checks for bad input,
and creates a multiplication table.
Student completes.

*/
package Chapter4;
import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args)
{

int size;
int value;
Scanner scan = new Scanner (System.in);

System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");

size = scan.nextInt();
while (size !=0)
{

while (size > 5 || size <0)
{
System.out.println("Sorry, not a valid table size from 1 to 5. Try again.");

System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");

size = scan.nextInt();
}



System.out.print("\t");
for (int horizontal = 1; horizontal <= size; horizontal++)
{ System.out.print(horizontal + "\t"); }
System.out.println();

System.out.print("\t");
for (int horizontal = 1; horizontal <= size; horizontal++)
{ System.out.print("_" + "\t");}

System.out.println();

for (int vertical = 1; vertical <= size; vertical++)
{ System.out.print(vertical + "|");
for (int x = 1; x<=size; x++)
{
System.out.print("\t" + vertical*x);
}

System.out.println();
}
System.out.print("Please enter the table size from 1 to 5 (0 to quit): ");

size = scan.nextInt();
}

System.out.println("\nDone!");

}
}
/* Expected output
Please enter the table size from 1 to 5 (0 to quit): 6
Sorry, not a valid table size from 1 to 5. Try again.
Please enter the table size from 1 to 5 (0 to quit): 2
1 2
_ _
1| 1 2
2| 2 4
Please enter the table size from 1 to 5 (0 to quit): 5
1 2 3 4 5
_ _ _ _ _
1| 1 2 3 4 5
2| 2 4 6 8 10
3| 3 6 9 12 15
4| 4 8 12 16 20
5| 5 10 15 20 25
Please enter the table size from 1 to 5 (0 to quit): 0
Done!
*/
