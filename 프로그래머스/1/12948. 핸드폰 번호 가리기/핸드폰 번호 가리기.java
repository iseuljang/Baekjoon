class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String star = "*".repeat(len - 4);
        String num = phone_number.substring(len - 4);
        return star + num;
    }
}