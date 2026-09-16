class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int n=nums.length;
        int count=0;
     
        for(int r=0;r<n;r++)
        {
            int prod=1;
            l=r;
           prod=prod*nums[r];
           if(prod<k)
           {
              count ++;
              l++;
           }
          while(l<n)
          {
            prod=prod*nums[l];
            if(prod<k)
            {
                count++;
                l++;
            }
            else
            {
                break;
            }
          }
        }
        return count;       
    }
}