private void quickSort(int[] nums, int low, int hi) {
        if (low < hi) {
            int pi = partition(nums, low, hi);
            
            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, hi);
        } 
    }
    
    private int partition(int[] nums, int low, int hi) {
        int pivot = nums[hi];
        
        int start = low - 1;
        
        for (int i = low; i < hi; i++) {
            if (nums[i] < pivot) {
                start++;
                swap(nums, start, i);
            }
        }
        swap(nums, start + 1, hi);
        return start + 1;
    }
    
    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
