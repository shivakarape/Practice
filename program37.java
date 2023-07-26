import java.util.*;

class DisplayF
{
    public void DisplayF(int iNo)
    {
    	int iCnt = 0;
    	for(iCnt = 1; iCnt <= iNo; iCnt++)
    	{
    		System.out.println(iCnt);
    	}
    }
}

class program37
{
    public static void main(String argv[])
    {
        int iValue = 0;
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter number: \n");
        iValue = in.nextInt();

	DisplayF(iValue);
        
    }
}
