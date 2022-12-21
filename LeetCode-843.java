class Solution {
    public int countDiff (String a, String b) {
        int count = 0;
        for (int i = 0; i < 6; i ++) {
            if (a.charAt(i) == b.charAt(i)) count ++;
        }
        return count;
    }
    public void findSecretWord(String[] wordlist, Master master) {       
        LinkedList<Integer> left = new LinkedList<>();
        for (int i = 0; i < wordlist.length; i ++) left.offer(i);
        while(true) {
            if (left.isEmpty()) break;
            Collections.shuffle(left);
            int current = left.poll();
            int diff = master.guess(wordlist[current]);
            int size = left.size();
            for (int j = 0; j < size; j ++) {
                int next = left.poll();
                if (countDiff(wordlist[current], wordlist[next]) == diff) left.offer(next);
            }
        }        
    }
}
