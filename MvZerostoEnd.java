
class MvZerostoEnd
{
    static void reorder(int[] A)
    {
        int i = 0, k = 0;
        for(i = 0; i < A.length; i++)
        {
            if(A[i] != 0)
            {
                A[k++] = A[i];
            }
        }
        for(i = k; i < A.length; i++)
        {
            A[i]  = 0;
        }
    }

    public static void main(String args[])
    {
        int Arr[] = {6, 0, 8, 2, 3, 0, 4, 0, 1};
        
        reorder(Arr);

        for(int i: Arr)
        {
            System.out.println(i);
        }
    }
}