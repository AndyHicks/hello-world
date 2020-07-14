/*
 * Program: LastThenFirst
 * Date: July 6, 2020
 * Programmer: Andy Hicks
 * Imported in VSCode July 14
 */

import java.util.Scanner;
public class LastThenFirst
{
    public static void main(String[] args)
    {
        System.out.println("LastThenFirst\n"); 

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a name: ");
        String theName = sc.nextLine();

        System.out.println("\nThe original name: " + theName);

        int nameLength = theName.length();
        int halfLength = nameLength / 2;

        String lastThenFirstName = theName.substring(halfLength) + theName.substring(0, halfLength);
        System.out.println("\nThe LastThenFirst name: " + lastThenFirstName);
    }
}
