class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (!st.isEmpty()) {
                Character peek = st.peek();
                switch (c) {
                    case ')':
                        if (!peek.equals('(')) return false;
                        st.pop();
                        continue;
                    case ']':
                        st.pop();
                        if (!peek.equals('[')) return false;
                        continue;
                    case '}':
                        st.pop();
                        if (!peek.equals('{')) return false;
                        continue;
                }
            }
            st.push(c);
        }
        return st.isEmpty();
    }
}
