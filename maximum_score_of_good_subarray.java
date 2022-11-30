class Solution {
    public int maximumScore(int[] nums, int k) {
          return(MaxArea(nums,k));
    }
     public static int MaxArea(int[] arr, int k) {
            Stack<Integer> st = new Stack<>();
            int ans = 0;
            for (int i = 0; i < arr.length; i++) {

                while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                    int h = arr[st.pop()];
                    int r = i;
                    if (r - 1 >= k) {
                        if (!st.isEmpty()) {

                            int l = st.peek();
                            if (l + 1 <= k) {
                                int area = h * (r - l - 1);
                                ans = Math.max(ans, area);
                            }

                        } else {
                            int area = h * r;
                            ans = Math.max(ans, area);
                        }
                    }
                }
                st.push(i);
            }

            int r = arr.length;
            while (!st.isEmpty()) {
                int h = arr[st.pop()];
                if (r - 1 >= k) {
                    if (!st.isEmpty()) {

                        int l = st.peek();
                        if (l + 1 <= k) {
                            int area = h * (r - l - 1);
                            ans = Math.max(ans, area);
                        }

                    } else {
                        int area = h * r;
                        ans = Math.max(ans, area);
                    }
                }
            }
            return ans;

        }

    }
    
