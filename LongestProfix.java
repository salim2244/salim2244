public class LongestProfix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length until it matches the start of the current string
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        LongestProfix solution = new LongestProfix();
        // Test cases
        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        String[] test3 = {"interview", "internet", "internal"};
        String[] test4 = {"apple", "apple", "apple"};
        String[] test5 = {};

        // Printing results
        System.out.println(solution.longestCommonPrefix(test1)); // "fl"
        System.out.println(solution.longestCommonPrefix(test2)); // ""
        System.out.println(solution.longestCommonPrefix(test3)); // "inte"
        System.out.println(solution.longestCommonPrefix(test4)); // "apple"
        System.out.println(solution.longestCommonPrefix(test5)); // ""
    }

}
