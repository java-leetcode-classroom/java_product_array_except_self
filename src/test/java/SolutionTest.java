import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void productExceptSelfExample1() {
    assertArrayEquals(new int[]{24, 12, 8, 6}, sol.productExceptSelf(
        new int[]{1,2,3,4}
    ));
  }
  @Test
  void productExceptSelfExample2() {
    assertArrayEquals(new int[]{0,0,9,0,0}, sol.productExceptSelf(
        new int[]{-1,1,0,-3,3}
    ));
  }
}