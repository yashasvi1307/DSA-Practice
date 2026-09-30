class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int MaxSum=nums[0];
        int CurrentSum=nums[0];
        for(int i=1;i<n;i++)
        {
         
          CurrentSum=Math.max(CurrentSum+nums[i],nums[i]);
          MaxSum=Math.max(CurrentSum,MaxSum);
          
        }
        return MaxSum;
    }
}