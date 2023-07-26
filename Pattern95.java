// Input    : 7
// Output   :  * * * * * * *

// Input    : 3
// Output   :   * * *

import java.util.Scanner;


public class Pattern95
{
    static void DisplayPattern(int iValue)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iValue ; iCnt++)
        {
            System.out.print("*\t");
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int iNo = 0;
        int iCnt = 0;

        System.out.println("Enter the number");
        iNo = in.nextInt();

        DisplayPattern(iNo);
    }
}