class Solution {
    public int evalRPN(String[] tokens) 
    {
       
        Stack<Integer> ans=new Stack<>();
        int a=0;
        int b=0;
       for (String num : tokens) {

     try {
        int value = Integer.parseInt(num);
        ans.push(value);         
    } 
    catch (NumberFormatException e) {
       if(num.equals("+"))
       {
          a= ans.pop();
          b=ans.pop();
          int operation=a+b;
          ans.push(operation);
       }
        if(num.equals("-"))
       {
          a= ans.pop();
          b=ans.pop();
          int operation=b-a;
          ans.push(operation);
       }
        if(num.equals("*"))
       {
          a= ans.pop();
          b=ans.pop();
          int operation=a*b;
          ans.push(operation);
       }
        if(num.equals("/"))
       {
          a= ans.pop();
          b=ans.pop();
          int operation=b/a;
          ans.push(operation);
       }
    }
}
    return ans.pop();
    }
}