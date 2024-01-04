class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the reference
        String referenceStr = strs[0];

        // Find the common prefix between the reference string and other strings
        StringBuilder requiredPrefix = new StringBuilder();
        for (int i = 0; i < referenceStr.length(); i++) {
            char crntChar = referenceStr.charAt(i);  // using charAt to find character at that index

            // Check against other strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) !=crntChar) {
                    // If characters don't match or reach the end of a string, stop
                    return requiredPrefix.toString();
                }
            }

            // If all strings have the current character, append to the common prefix
           requiredPrefix.append(crntChar);
        }

        return requiredPrefix.toString();
    }
}

