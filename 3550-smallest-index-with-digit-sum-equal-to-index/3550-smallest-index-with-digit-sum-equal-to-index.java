class Solution {
    public int smallestIndex(int[] nums) {
       int  n=nums.length;
        for(int i=0; i<n ; i++)
        {
            String s=String.valueOf(nums[i]);
             int sum=0;
            for(int j=0; j<s.length();j++)
            {
               sum=sum+(s.charAt(j)-'0');
            }
            if(sum==i)
            {
                return i;
                
            }
           
        }
        return -1;
    }
}