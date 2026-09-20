class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> ans=new ArrayList<>();
         int  stream=1;
         int i=0;
       while(stream<=n &&  i<target.length)
       {
        ans.add("Push");
        if(target[i]==stream)
        {
            i++;
        }
        else
        {
            ans.add("Pop");
        }
        stream++;
       }
       return ans;
    }
}