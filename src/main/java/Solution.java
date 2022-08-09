import java.util.Arrays;

public class Solution {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    Arrays.fill(ans, 1);
    int lower=1, upper = 1;
    for (int pos = 0; pos < n; pos++) {
      if (pos > 0) {
        lower *= nums[pos-1];
        upper *= nums[n-pos];
      }
      ans[pos] *= lower;
      ans[n-1-pos] *= upper;
    }
    return ans;
  }
}
