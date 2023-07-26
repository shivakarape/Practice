// selection sorting array in increasing and decreasing order
// find position of desired value and replace that value with value of current position

#include<stdio.h>
#include<stdlib.h>

int selectionSort(int arr[], int iLength)
{
    int i = 0, k = 0;
    int temp = 0;
    int minPos = 0;
    int itr = 0;

    for(i = 0; i < iLength-1; i++ )
    {
        minPos = i;
        for(k = i; k < iLength-1; k++)
        {
            // find the position of low value element
            if(arr[k+1] < arr[k])
            {
                minPos = k+1;
                itr++;
            }
        }
        // replace low value at current position
        temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
    return itr;
}

int main()
{
    int * Arr = NULL;
    int iSize = 0;
    int iCnt = 0;
    int iRet = 0;
    
    printf("Enter number of elements\n");
    scanf("%d",&iSize);
    
    Arr = (int*)malloc(iSize * sizeof(int));
    printf("Enter %d elements\n",iSize);
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        scanf("%d",&Arr[iCnt]);
    }

    printf("Array in increasing order\n");
    iRet = selectionSort(Arr, iSize);
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("%d ",Arr[iCnt]);
    }
    printf("\n");

    printf("Iterations = %d\n",iRet);
    
    free(Arr);

    return 0;
}
