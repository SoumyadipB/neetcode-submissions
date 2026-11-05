class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length <= 1)
        return false;

        Set<Integer> dp = new HashSet<>();
        for(int num : nums){
            if(dp.contains(num)){
                return true;
            }else
            dp.add(num);
        }
        return false;
    }
}