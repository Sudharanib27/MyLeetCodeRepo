class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mapS = new HashMap<>();

        for(String s: strs) {
            char[] charArrayforS = s.toCharArray();
            Arrays.sort(charArrayforS);
            String sortedWord = new String(charArrayforS);

            if(!mapS.containsKey(sortedWord)) {
                mapS.put(sortedWord, new ArrayList<>());
            }
            mapS.get(sortedWord).add(s);
        }

        return new ArrayList(mapS.values());
    }
}