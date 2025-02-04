class Trie {
    Trie[] child;
    boolean isEnd;

    public Trie() {
        child = new Trie[26];
        isEnd = false;
    }
    
    public void insert(String word) {
        Trie root = this;
        for (char ch: word.toCharArray()) {
            if (root.child[ch - 'a'] == null) {
                root.child[ch - 'a'] = new Trie();
            }

            root = root.child[ch - 'a'];
        }
        root.isEnd = true;
    }
    
    public boolean search(String word) {
        Trie root = this;
        for (char ch: word.toCharArray()) {
            if (root.child[ch - 'a'] == null) {
                return false;
            }

            root = root.child[ch - 'a'];
        }

        return root.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Trie root = this;
        for (char ch: prefix.toCharArray()) {
            if (root.child[ch - 'a'] == null) {
                return false;
            }

            root = root.child[ch - 'a'];
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */