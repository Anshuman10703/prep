class rotateArray {
    public static int[] rotate(int nums[]) {
        int temp = nums[0];  
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i]; 
        }
        nums[nums.length - 1] = temp;  
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int rotated[] = rotate(nums);
        
        for (int i : rotated) {
            System.out.print(i + " ");
        }
    }
}
