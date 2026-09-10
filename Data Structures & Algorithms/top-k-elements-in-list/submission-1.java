class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0)+1);

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            heap.add(new int[]{entry.getKey(), entry.getValue()});
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] arr = new int[k];
        for(int i=0; i<k; ++i){
            int[] pair = heap.poll();
            arr[i] = pair[0];
        }
        return arr;
    }
}
