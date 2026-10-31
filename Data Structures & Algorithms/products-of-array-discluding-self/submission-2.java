class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int allProduct = 1;
        int zeroCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            allProduct = allProduct * nums[i];
            if (nums[i] == 0) {
                zeroCount++;
            }
        }

        System.out.println(zeroCount);

        if (zeroCount > 1) {
            for (int i = 0; i < nums[i]; i++) {
                result[i] = 0;
            }
            return result;
        }

        if (zeroCount == 1) {
            
            allProduct = 1;
            for (int i = 0; i < nums.length; i++) {
                
                if (nums[i] != 0) {
                    result[i] = 0;
                } else {
                    
                    for (int j = 0; j < nums.length; j++) {
                        if(i == j) {
                            continue;
                        }
                        allProduct = allProduct * nums[j];
                    }
                    result[i] = allProduct;
                }
            }
            return result;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int currentProduct = allProduct / nums[i];
            result[i] = currentProduct;
        }

        return result;
    }
}
