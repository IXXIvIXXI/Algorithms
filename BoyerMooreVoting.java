public class BoyerMoore {
  public static int findMajority(int[] nums) {
    int count = 0, candidate = -1;
    
    for (int num : nums) {
      if (count == 0) candidate = num;
      // if the current num is not equavalent to the candidate
      // we decrement count or we increment otherwise
      count += (num == candidate ? 1 : -1);
    }
    
    // check if candidate is valid
    // we can just return the candidate if the given
    // array is guaranteed to have a number has the
    // majority amount
    count = 0;
    for (int num : nums) {
      if (num == candidate) count++;
    }
    
    return count > (nums.length / 2) ? candidate : -1;
  }  
}
