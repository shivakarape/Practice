
class SelectionSort
{
    static void sortLH(int[] arr)
    {
        int i = 0, j = 0;
        int temp = 0;
        int minPos = 0;

        for(i = 0; i < (arr.length-1); i++)
        {
            minPos = i;
            for(j = i; j < (arr.length-1); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    minPos = j+1;
                }
            }
            temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void main(String[] args)
    {
        int Arr[] = {64, 25, 12, 22, 11};
        
        sortLH(Arr);

        for(int x: Arr)
        {
            System.out.print(x +" ");
        }
        System.out.print("\n");
    }
}