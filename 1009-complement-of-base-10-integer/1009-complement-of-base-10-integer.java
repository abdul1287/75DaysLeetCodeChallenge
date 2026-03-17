class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<bin.length(); i++) {
            if(bin.charAt(i) == '0') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }

        String res = sb.toString();
        return Integer.parseInt(res, 2);
    }
}