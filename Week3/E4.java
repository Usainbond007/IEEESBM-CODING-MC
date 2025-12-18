import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer>st=new Stack<>();
       
        for(int i=0;i<asteroids.length;i++)
        {
            int element=asteroids[i];
            if(element>0)
            st.push(element);
            else
           {
               while((!st.isEmpty())&&st.peek()>0&&Math.abs(element)>st.peek())
               {
                   
                      st.pop();
                   
               }

               if(st.isEmpty()||st.peek()<0)
               st.push(element);
          
               if(st.peek()==-element)
               st.pop();
           }
        }
        int arr[]=new int[st.size()];
        int len=st.size();
        for(int i=len-1;i>=0;i--)
        {
            arr[i]=st.pop();
        }
        return arr;
    }
}
https://leetcode.com/problems/asteroid-collision/
