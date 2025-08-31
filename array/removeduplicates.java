class removeduplicates {
    public static int duplicates(int num[]) {
        if (num.length == 0) return 0;
        
        int i = 0;
        for (int j : num) {
            if (j != num[i]) {
                i++;
                num[i] = j;
            }
        }
        return i + 1; // length of array without duplicates
    }

    public static void main(String[] args) {
        int num[] = {2, 2, 2, 3, 3, 3, 4, 4, 4};

        int length = duplicates(num);

        System.out.print("Array without duplicate values: ");
        for (int i : length) {
            System.out.print(num[i] + " ");
        }
    }
}
