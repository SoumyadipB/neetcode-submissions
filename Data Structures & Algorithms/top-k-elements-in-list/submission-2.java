class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<int[]> arr = new ArrayList<>();
        List<Integer> mapList = new ArrayList<>();
        List<Integer> respList = new ArrayList<>();
        for(int i = 0; i< nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
          
        }
        for(Map.Entry<Integer,Integer> result : mp.entrySet()){
            arr.add(new int[] {result.getValue(), result.getKey()});
        }
        arr.sort((a,b)->b[0]-a[0]);
        int[] res = new int[k];
        for(int j=0; j<k; j++){
            res[j] = arr.get(j)[1];
        }
        return res;
    }
}
