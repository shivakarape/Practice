/*
input: [8, 7, 2, 5, 3, 1]
target = 10

output:

pair found (8, 2)
or
pair found (7, 3)
*/

class PairOfSum
{
    static void targetPairSum(int[] nums, int target)
    {
        int i = 0, j = 0;
        for(i = 0; i < nums.length -1 ; i++)
        {
            for(j = i+1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    // used printf like C 
                    System.out.printf("Pair found (%d %d)", nums[i], nums[j]);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }

    public static void main(String args[])
    {
        int[] nums = {8,7,2,5,3,1};
        int target = 10;

        targetPairSum(nums, target);
    }
}

// The time complexity of the above solution is O(n2) and doesn’t require any extra space, where n is the size of the input.