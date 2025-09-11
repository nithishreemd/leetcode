class Solution {
    public int[] twoSum(int[] nums, int k) {
        int sum=0;
        int res[] = new int[2];
        for(int i =0;i<nums.length;i++)
        {    
            //sum=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==k){
                    res[0] = i;
                    res[1] = j;
                    //return res;
                }
                
            }
        }
        return res;
    }
}