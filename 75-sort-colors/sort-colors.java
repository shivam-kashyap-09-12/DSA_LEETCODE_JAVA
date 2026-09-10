class Solution {
    public void sortColors(int[] arr) {
        int i=0;
        int n=arr.length;
        int l=0;
        int r=n-1;
        int temp1=0;
        int temp2=0;
        while(i<=r)
        {
            if(arr[i]==0)
            {
               temp2=arr[l];
               arr[l]=arr[i];
               arr[i]=temp2;
               l++;
               i++;
            }
            else if(arr[i]==2)
            {
               temp1=arr[r];
               arr[r]=arr[i];
               arr[i]=temp1;
               r--;
            }
            else if(arr[i]==1)
            {
                i++;
            }
        }
    }
}