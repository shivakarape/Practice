
class ValidParanthesis3
{
    public boolean isValid(String s)
    {
        // String size must be even
        if(s.length() % 2 != 0){
            return false;
        }

        // At start Closing Bracket // At End Opening Bracket
        char t1 = s.charAt(0);
        char t2 = s.charAt(s.length()-1);
        if((t1 == ')') || (t1 == '}') || (t1 == ']') || (t2 == '(') || (t2 == '[') || (t2 == '{'))
        return false;
        boolean bflag = true;
        
        // Creating Array from String
        char arr[] = s.toCharArray();
        
        if(bflag == true){
            bflag = test1(arr);
        // System.out.println("1: "+bflag);
        }

        if(bflag == true){
            bflag = test2(arr);
        // System.out.println("2: "+bflag);
        }

        if(bflag == true){
            bflag = test3(arr);
        // System.out.println("3: "+bflag);
        }
        
        
        return bflag;
    }

    public boolean test1(char[] arr)
    {
        boolean bflag = true;
        int i = 0;

        while(i < (arr.length-1))
        {
            if((arr[i] == '(') && ((arr[i+1] == '}') || (arr[i+1] == ']')))
            {
                bflag = false;  break;
            }
            else if((arr[i] == '{') && ((arr[i+1] == ')') || (arr[i+1] == ']')))
            {
                bflag = false;  break;
            }
            else if((arr[i] == '[') && ((arr[i+1] == '}') || (arr[i+1] == ')')))
            {
                bflag = false;  break;
            }
            i++;
        }
        return bflag;
    }

    public boolean test2(char[] arr)
    {
        int prOp = 0;
        int prCl = 0;
        int crOp = 0;
        int crCl = 0;
        int sqOp = 0;
        int sqCl = 0;

        for(int i = 0; i < arr.length; i++)
        {
            switch(arr[i])
            {
                case '(': prOp++; break;
                case '{': crOp++; break;
                case '[': sqOp++; break;
                case ')': prCl++; break;
                case '}': crCl++; break;
                case ']': sqCl++; break;
            }
        }
        // System.out.println("prOp: "+prOp +" prCl: " +prCl +"\ncrOp: "+crOp +" crCl: "+crCl +"\nsqOp: "+sqOp +" sqCl: "+sqCl+"\n");
        if((prOp != prCl) || (crOp != crCl) || (sqOp != sqCl))
            return false;
        else
            return true;
    }

    public boolean test3(char[] arr)
    {
        boolean bflag = true;
        
        for(int i = 0; ((i < arr.length-1)); i++)
        {
            if(arr[i] == '(')
            for(int j = i+1; j < arr.length; j+=2)
            {
                if((arr[j] == ')'))
                {
                    arr[j] = '0';
                    break;
                }
                else if(j == (arr.length-2))
                {
                    bflag = false;  break;
                }
                // System.out.println("Not false");
            }

            else if(arr[i] == '{')
            for(int j = i+1; j < arr.length; j+=2)
            {
                if((arr[j] == '}'))
                {
                    arr[j] = '0';
                    break;
                }
                else if(j == (arr.length-2))
                {
                    bflag = false;  break;
                }   
                // System.out.println("Not false");
            }

            else if(arr[i] == '[')
            for(int j = i+1; j < arr.length; j+=2)
            {
                if((arr[j] == ']'))
                {
                    arr[j] = '0';
                    break;
                }
                else if(j == (arr.length-2))
                {
                    bflag = false;  break;
                }
                // System.out.println("Not false");
            }
        }
        return bflag;
    }

    public static void main(String arg[])
    {
        ValidParanthesis3 vobj = new ValidParanthesis3();

        System.out.println(vobj.isValid("(]")+"\n");         // false
        System.out.println(vobj.isValid("((")+"\n");         // false
        System.out.println(vobj.isValid("({)}")+"\n");       // false
        System.out.println(vobj.isValid("[[[]")+"\n");       // false
        System.out.println(vobj.isValid("()))")+"\n");       // false
        System.out.println(vobj.isValid("[([]])")+"\n");     // false
        System.out.println(vobj.isValid("(([]){})")+"\n");   // true
        System.out.println(vobj.isValid("[]{}(){}")+"\n");   // true
        
        
    }
}