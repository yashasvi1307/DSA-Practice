class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> set = solve(expression);
        List<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }

    private Set<String> solve(String s) {
        Set<String> result = new HashSet<>();
        result.add("");

        int i = 0;

        while (i < s.length()) {

            Set<String> current = new HashSet<>();

            if (s.charAt(i) == '{') {
                int start = i + 1;
                int count = 1;

                i++;

                while (count != 0) {
                    if (s.charAt(i) == '{') count++;
                    if (s.charAt(i) == '}') count--;
                    i++;
                }

                String inside = s.substring(start, i - 1);

                // Split by top-level commas
                Set<String> insideSet = new HashSet<>();
                int begin = 0;
                count = 0;

                for (int j = 0; j < inside.length(); j++) {
                    if (inside.charAt(j) == '{') count++;
                    else if (inside.charAt(j) == '}') count--;
                    else if (inside.charAt(j) == ',' && count == 0) {
                        insideSet.addAll(solve(inside.substring(begin, j)));
                        begin = j + 1;
                    }
                }

                insideSet.addAll(solve(inside.substring(begin)));

                current = insideSet;

            } else {
                current.add(String.valueOf(s.charAt(i)));
                i++;
            }

            // Concatenate result with current
            Set<String> temp = new HashSet<>();

            for (String a : result) {
                for (String b : current) {
                    temp.add(a + b);
                }
            }

            result = temp;
        }

        return result;
    }
}