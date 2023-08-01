class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = 0;
        int i = 0, j = 0;
        int z = 0;

        if(n > 0) 
        while((i < m) && (j < n))
        {
            if(nums1[i] > nums2[j]) 
            {
                z = m-2;
                if(nums1[i+1] != 0)
                {
                    while(z >= i)
                    {
                        nums1[z+1] = nums1[z];
                        z--;
                    } 
                    nums1[i] = nums2[j];
                    i++;
                    j++;
                }
                else
                {
                    nums1[i+1] = nums1[i];
                    nums1[i] = nums2[j];
                    i++;
                    j++;
                }
            }
            else if(nums1[i] < nums2[j])
            {
                if(nums1[i] == 0)
                {
                    nums1[i] = nums2[j];
                    i++;
                    j++;
                }
                else
                {
                    i++;
                }
            }
            else
            {
                i++;
            }
        }
            
    }
}

class Add2sortedArray
{
    public static void main(String arg[])
    {
        int nums1[] = {1,2,3,0};
        int nums2[] = {0};
        
        Solution sobj = new Solution();
        sobj.merge(nums1, nums1.length, nums2, nums2.length);

        for(int i : nums1)
        System.out.println(i);
    }
}