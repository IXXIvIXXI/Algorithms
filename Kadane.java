public int kadane(int[] arr) {
  int maxSoFar = 0;
  int maxCurrent = 0;
  
  for (int i = 0; i < arr.length; i++) {
    maxCurrent = Math.max(maxCurrent + arr[i], arr[i]);
    maxSoFar = Math.max(maxSoFar, maxCurrent);
  }
  
  return maxSoFar;
}
