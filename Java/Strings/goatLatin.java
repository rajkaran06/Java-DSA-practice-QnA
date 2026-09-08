class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String wd = words[i];

            if (!isVowel(wd.charAt(0))) {
                wd = wd.substring(1) + wd.charAt(0);
            }

            wd += "ma";
            wd += "a".repeat(i + 1);

            if (i > 0) {
                ans.append(" ");
            }

            ans.append(wd);
        }

        return ans.toString();
    }

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }
}
