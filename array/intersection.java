import java.util.*;

class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        HashSet<Integer> result = new HashSet<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Convert set → array
        int[] ans = new int[result.size()];
        int idx = 0;
        for (int val : result) {
            ans[idx++] = val;
        }

        return ans;
    }

    public static void main(String[] args) {
        Intersection obj = new Intersection();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = obj.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result)); // Output: [9, 4] (order may vary)
    }
}
