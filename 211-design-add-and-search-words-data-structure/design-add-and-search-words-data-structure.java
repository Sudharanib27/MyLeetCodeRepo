class WordDictionary {
    WordDictionary[] child;
    boolean isEnd;

    public WordDictionary() {
        child = new WordDictionary[26];
        isEnd = false;
    }
    
    public void addWord(String word) {
        WordDictionary root = this;
        for (char ch: word.toCharArray()) {
            if (root.child[ch - 'a'] == null) {
                root.child[ch - 'a'] = new WordDictionary();
            }
            root = root.child[ch - 'a'];
        }
        root.isEnd = true;
    }
    
    public boolean search(String word) {
        WordDictionary root = this;
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if (c == '.') {
                for (WordDictionary ch: root.child) {
                    if (ch != null && ch.search(word.substring(i+1))) {
                        return true;
                    }
                }
                return false;
            }

           if (root.child[c - 'a'] == null) {
            return false;
           }

           root = root.child[c - 'a'];
            
        }
        return root != null && root.isEnd;
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */