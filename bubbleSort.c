// selection sorting array in increasing and decreasing order

#include<stdio.h>
#include<stdlib.h>

int bubbleSort(int arr[], int iLength)
{
    int i = 0, k = 0;
    int temp = 0;
    int itr = 0;

    for(i = 0; i < iLength-1; i++)
    {
        for(k = 0; k < iLength-1; k++)
        {
           if(arr[k+1] < arr[k])
           {
                temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = temp;
                itr++;
           }
        }
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
    iRet = bubbleSort(Arr, iSize);
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("%d ",Arr[iCnt]);
    }
    printf("\n");

    printf("Iterations = %d\n",iRet);
    
    free(Arr);

    return 0;
}
