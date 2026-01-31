class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        int first = 0;
        int last = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    first = i;
                    last = j;
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
}