class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> appearedNumbers = new HashSet<>();

        if(nums.length <= 1) {
            return false;
        }

        appearedNumbers.add(nums[0]);

        for(int i = 1; i < nums.length; i++) {
            int number = nums[i];

            if(appearedNumbers.contains(number)) {
                return true;
            }

            appearedNumbers.add(number);
        }
        
        return false;
    }
}