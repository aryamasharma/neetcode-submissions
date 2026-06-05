class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int prod = 1;
        int zeros = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                prod *= nums[i];
            }else{
                zeros += 1;
            }
        }

        for(int i = 0; i < product.length; i++ ){
            if(zeros == 1 && nums[i] == 0){ //If there is one zero and this is it
                product[i] = prod; //then this is the entire product
            }else if(zeros > 0){ //if there are more zeros than 1
                product[i] = 0;
            }else{
                product[i] = prod/nums[i];
            }
        }
        return product;
    }
}  
