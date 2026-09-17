class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int r=0;r<nums.length;r++)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>2)
            {
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                {
                    map.remove(nums[left]);
                }
                left++;
            }
            max=Math.max(max,r-left+1);
        }
       
        return max;
    }
}