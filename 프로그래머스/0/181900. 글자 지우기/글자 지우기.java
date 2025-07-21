class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] toDelete = new boolean[my_string.length()];

        for(int index : indices) {
            toDelete[index] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            if(!toDelete[i]) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}