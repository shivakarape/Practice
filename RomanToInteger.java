class RomanToInteger {
    public int romanToInt(String s) 
    {
        int iSum = 0;
        char Romn[] = s.toCharArray();
        int N[] = new int[Romn.length+1];

        int iCnt = 0;
        for(; iCnt < Romn.length ; iCnt++)
        {
            switch(Romn[iCnt])
            {
                case 'I': N[iCnt] = 1; break;
                case 'V': N[iCnt] = 5; break;
                case 'X': N[iCnt] = 10; break;
                case 'L': N[iCnt] = 50; break;
                case 'C': N[iCnt] = 100; break;
                case 'D': N[iCnt] = 500; break;
                case 'M': N[iCnt] = 1000; break;
            }
        }

        iCnt = N.length;
        for(int i = 1; i <= N.length; i++)
        {
            if(iCnt > 1)
            {
                if(N[i-1] < N[i])
                {
                    iSum = iSum + N[i] - N[i-1];
                    iCnt = iCnt - 2;
                    i++;
                }
                else
                {
                    iSum = iSum + N[i-1];
                    iCnt--;
                }
            }
            else
            {
                iSum = iSum + N[i-1];
            }
        }
        return iSum;
    }
}