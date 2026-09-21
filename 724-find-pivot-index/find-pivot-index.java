class Solution {
    public int pivotIndex(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int l=0;l<n;l++)
        {
             int left_sum=0;
             int right_sum=0;
        for(int r=l+1;r<n;r++)
        {
             right_sum+=nums[r];
        }
        for(int p=l-1;p>=0;p--)
        {
             left_sum=left_sum+nums[p];
        }
        if(left_sum==right_sum)
        {
            return l;
        }
        }
        return -1;
            }
}
           