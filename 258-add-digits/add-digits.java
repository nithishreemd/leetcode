class Solution {
    public int addDigits(int n) {
         int sum =0;
         if(n<=9)
         {
            return n;
         }
        while(n>=10)
        { sum =0;
            while(n>0)
            {
                int digit=n%10;
                sum+=digit;
                n=n/10;

            }

            n=sum;
        }
        return sum;
        
       // return 1 + (num - 1)%9;

    }
}