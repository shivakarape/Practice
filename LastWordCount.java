import java.util.Scanner;

class LastWordCount 
{
    public static int lengthOfLastWord(String s) 
    {
        String str = s.trim();
        int ipos = 0;
        int iCnt;
        for(iCnt = str.length()-1;iCnt >= 0 ; iCnt--)
        {
           if(str.charAt(iCnt) == ' ')
                break;
            else
                ipos++;  
        }    
        return ipos;
    }

    public static void main(String [] arg)
    {
        Scanner sobj = new Scanner(System.in);

        String str = sobj.nextLine();

        System.out.println(lengthOfLastWord(str));
    }
}