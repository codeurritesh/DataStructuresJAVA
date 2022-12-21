class StreamChecker {
    class Trie{
        Trie array[] = new Trie[26];
        boolean isWord = false;
    }
    
    StringBuilder sb = new StringBuilder("");  // query in reverse order
    Trie root;
    
    public StreamChecker(String[] words) {
        root = new Trie();
        for(int i = 0; i < words.length; i++) {
            buildTree(root, words[i]);
        }
    }
    
    public boolean query(char letter) {
        sb.append(letter); // update input stream
        Trie current = root;
        for(int i = sb.length() - 1; i >= 0; i--) { // query in reverse order
            int index = sb.charAt(i) - 'a';
            if( current.array[index] != null ) {
                current = current.array[index];
                if( current.isWord )
                    return true;
            }
            else
                return false;
        }
        return false;
    }
    
    public void buildTree(Trie root, String word) {
        Trie current = root;
        for(int i = word.length() - 1; i >= 0; i--) { // build dictionary of each word in reverse order
            int index = word.charAt(i) - 'a';
            current.array[index] = current.array[index] != null ? current.array[index] : new Trie();
            current = current.array[index];
        }
        current.isWord = true;
    }
}
