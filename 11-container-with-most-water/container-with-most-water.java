class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int max_area=0;
        while(l<r)
        {
          int h= Math.min(height[l],height[r]);
          int width=r-l;
          int area=h*width;
          max_area=Math.max(max_area,area);
          if(height[l]<=height[r])
          {
            l++;
          }
          else
          r--;
        }
        return max_area;
    }
}