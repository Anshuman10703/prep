import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            int val1 = nums1[i], val2 = nums2[j];

            if (val1 == val2) {
                addIfNotPresent(result, val1);
                i++; j++;
            } else if (val1 < val2) {
                addIfNotPresent(result, val1);
                i++;
            } else {
                addIfNotPresent(result, val2);
                j++;
            }
        }

        while (i < nums1.length) {
            addIfNotPresent(result, nums1[i++]);
        }
        while (j < nums2.length) {
            addIfNotPresent(result, nums2[j++]);
        }

        // Manual conversion from List<Integer> to int[]
        int[] arr = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            arr[k] = result.get(k);
        }
        return arr;
    }

    private void addIfNotPresent(List<Integer> result, int val) {
        if (result.isEmpty() || result.get(result.size() - 1) != val) {
            result.add(val);
        }
    }

    // Test
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 6, 7};

        int[] ans = s.unionArray(nums1, nums2);
        System.out.println(Arrays.toString(ans)); // [1, 2, 3, 4, 5, 6, 7]
    }
}
