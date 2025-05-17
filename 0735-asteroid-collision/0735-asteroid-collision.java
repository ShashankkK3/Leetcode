class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    
        Stack<Integer> s=new Stack<>();
    
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>0)
            {
                s.push(asteroids[i]);
            }
            else 
            {
                while(!s.isEmpty() && (Math.abs(asteroids[i]))>s.peek()  && s.peek()>0)
                {
                  s.pop();
                }
                if(s.isEmpty() || s.peek()<0)
                {
                    s.push(asteroids[i]);

                }else if(s.peek() == Math.abs(asteroids[i]))
                {
                    s.pop();
                }
                   
             }
        }
        

        int array[]=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--)
        {
            array[i]=s.pop();
        }
        return array;
    }
}