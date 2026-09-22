class Solution {
    public boolean isPalindrome(int x) {
        int prev=x;
        int ans=0;
         int a=0;
       while(x>0)
       {
        a=x%10;
        ans=ans*10+a;
        x=x/10;
       }
         if(ans==prev)
         {
            return true;
         }
         else
         {
            return false;
         }
    }
}