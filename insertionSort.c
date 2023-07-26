// Insertion Sort 

#include<stdio.h>
#include<stdlib.h>

int insertionSort(int arr[], int iLength)
{
    int i = 0, j = 0, temp = 0, itr = 0;

    for(i = 1; i < iLength; i++)
    {
        temp = arr[i];
        j = i;
        while(arr[j-1] > temp && j > 0)
        {
            itr++;
            arr[j] = arr[j - 1];
            j--;
        }
        arr[j] = temp;
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
    iRet = insertionSort(Arr, iSize);
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("%d ",Arr[iCnt]);
    }
    printf("\n");
    
    free(Arr);

    return 0;
}
