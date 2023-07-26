// C program for Merge Sort
#include <stdio.h>
#include <stdlib.h>
 
// Merges two subarrays of arr[].
// First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
void merge(int arr[], int l, int m, int r)
{
    int i, j, k;
    int n1 = m - l + 1;
    int n2 = r - m;
 
    // Create temp arrays
    int L[n1], R[n2];
 
    // Copy data to temp arrays L[] and R[]
    for (i = 0; i < n1; i++)
    {
        L[i] = arr[l + i];
    }
    for (j = 0; j < n2; j++)
    {
        R[j] = arr[m + 1 + j];
    }
 
    // Merge the temp arrays back into arr[l..r
    i = 0;
    j = 0;
    k = l;
    while (i < n1 && j < n2) 
    {
        if (L[i] <= R[j]) 
        {
            arr[k] = L[i];
            i++;
        }
        else 
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
 
    // Copy the remaining elements of L[],
    // if there are any
    while (i < n1) 
    {
        arr[k] = L[i];
        i++;
        k++;
    }
 
    // Copy the remaining elements of R[],
    // if there are any
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}
 
// l is for left index and r is right index of the
// sub-array of arr to be sorted
void mergeSort(int arr[], int leftPos, int rightPos)
{
    int midPos = 0;
	
    if (leftPos < rightPos) 
    {
        midPos = (rightPos + leftPos)/2;

        // Sort first and second halves
        mergeSort(arr, leftPos, midPos);
        mergeSort(arr, midPos + 1, rightPos);
        merge(arr, leftPos, midPos, rightPos);
    }
}
 
// Function to print an array
void printArray(int Arr[], int iLength)
{
    int iCnt = 0;
    for (iCnt = 0; iCnt < iLength; iCnt++)
        printf("%d ", Arr[iCnt]);
    printf("\n");
}
 
// Driver code
int main()
{
    int arr[] = { 6, 5, 12, 10, 9, 1 };
    int arr_size = sizeof(arr) / sizeof(arr[0]);
 
    printf("Given array is \n");
    printArray(arr, arr_size);
 
    mergeSort(arr, 0, arr_size - 1);
 
    printf("\nSorted array is \n");
    printArray(arr, arr_size);
    return 0;
}
