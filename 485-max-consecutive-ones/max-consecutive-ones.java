class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j=0;
        int n=nums.length;
        int count=0;
        int max_one=0;
    while(j<n)
    {
      if(nums[j]==1)
      {
        count++;
        j++;
      }
      else
      {
        max_one=Math.max(max_one,count);
        count=0;
        j++;
      }
    }

      return Math.max(max_one,count);
    }
}