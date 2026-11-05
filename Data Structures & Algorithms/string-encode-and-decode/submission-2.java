class Solution {

    public String encode(List<String> strs) {
        StringBuilder strDecode = new StringBuilder();
        for (String str : strs) {
            strDecode.append(str.length()).append("#").append(str);
        }
        return strDecode.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, hashIndex));
            res.add(str.substring(hashIndex + 1, hashIndex + 1 + len));
            i = hashIndex + 1 + len;
        }
        return res;
    }
}
