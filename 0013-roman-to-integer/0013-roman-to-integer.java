import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {

            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (current < next) {
                ans = ans - current;
            } else {
                ans = ans + current;
            }
        }

        // Add the last character
        ans = ans + map.get(s.charAt(n - 1));

        return ans;
    }
}