class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            int currentElement = nums[i];
            int elementToFind = target - currentElement;
            if(indexMap.containsKey(elementToFind)) {
                return new int[] {i, indexMap.get(elementToFind)};
            } else {
                indexMap.put(nums[i], i);
            }
        }
        return null;
    }
}
