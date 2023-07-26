// intput = {"ar", "a"}
// output = a

import java.util.Scanner;

class Solution1 {
    public String longestCommonPrefix(String[] strs) 
    {
        int iMin = strs[0].length();
        int i = 0;
        for( ; i < strs.length-1 ; i++)
        {
            if(iMin == 0)
            {
                break;
            }
            int j = 0;
            int iMax = 0;
            while((j < iMin) && (j < strs[i].length()) && (j < strs[i+1].length()))
            {
                if(strs[i].charAt(j) == strs[i+1].charAt(j))
                {
                    iMax++;
                }
                else
                {
                    break;
                }
                j++;
            }
            if(iMax < iMin)
            {
                iMin = iMax;
            }
        }
        if(iMin == 0)   
            return "";
        else
        {
            char Arr[] = new char[iMin];
            for(i = 0; i < iMin; i++)
            {
                Arr[i] = strs[0].charAt(i);
            }
            String x = new String(Arr);
            return x;
        }
    }
}

class CommonSuffix
{
    public static void main(String [] arg)
    {
        Scanner sobj = new Scanner(System.in);
        Solution1 sl = new Solution1();

        String str[] = {"ab", "a"};

        String sRet = sl.longestCommonPrefix(str);

        System.out.println(sRet);

     }
}
// level : easy
