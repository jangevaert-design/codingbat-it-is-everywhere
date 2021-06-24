package edu.cnm.deepdive;

/*

We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the
array, at least one of the pair is that value.
Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */

public class CodingBatItIsEverywhere {

  private static int[] one = {1, 2, 1, 3};
  private static int[] two = {1, 2, 1, 3};
  private static int[] three = {1, 2, 1, 3, 4};

  public static void main(String[] args) {
    System.out.println("For the array [1, 2, 1, 3] and the int 1, the outcome will be "
        + isEverywhere(one, 1) + ".");
    System.out.println("For the array [1, 2, 1, 3] and the int 2, the outcome will be "
        + isEverywhere(two, 2) + ".");
    System.out.println("For the array [1, 2, 1, 3, 4] and the int 1, the outcome will be "
        + isEverywhere(three, 1) + ".");
  }

  public static boolean isEverywhere(int[] nums, int val) {

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != val  && nums[i + 1] != val) {
        return false;
      }
    }
    return true;
  }

}
