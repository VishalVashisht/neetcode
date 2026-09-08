class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i=0; i<s.length(); ++i){
            int cnt = hash.getOrDefault(s.charAt(i), 0);
            hash.put(s.charAt(i), cnt+1);
        }

        for(int i=0; i<t.length(); ++i){
            int cnt = hash.getOrDefault(t.charAt(i), 0);
            hash.put(t.charAt(i), cnt-1);
        }

        for(int n : hash.values()){
            if(n != 0) return false;
        }
        return true;
    }
}