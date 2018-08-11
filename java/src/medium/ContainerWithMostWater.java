package medium;

class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = new int[]{1, 2, 3, 4};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, temp);
            }
        }
        return max;
    }
}

/* Another approach

public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
} */