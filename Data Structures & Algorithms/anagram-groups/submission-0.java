class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; ++i){
            String sOG = strs[i];
            char arr[] = sOG.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            if(map.containsKey(s)) {
                map.get(s).add(sOG);
            } else {
                List<String> ls = new ArrayList<>();
                ls.add(sOG);
                map.put(s, ls);
            }
        }

        List<List<String>> ls = new ArrayList<>();
        for(List<String> l : map.values()){
            ls.add(l);
        }
        return ls;
    }
}
