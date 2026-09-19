class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate=0;
        int missing=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int check=nums[i];
            for(int j=0;j<n;j++)
            {
                if( i!=j && nums[i]==nums[j])
                 {
                    duplicate=nums[i];
                 }
            }
        }
       for(int i=1;i<=n;i++)
       {
        boolean found=false;
        for(int j=0;j<n;j++)
        {
           if(nums[j]==i)
           {
            found=true;
            break;
           }
         
        }
          if(found==false)
           {
            missing=i;
           }
       }
        return new int[]{duplicate,missing};
    }
}