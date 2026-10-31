

class Solution {
    public String encode(List<String> strs) {
        StringBuilder lengths = new StringBuilder();
        StringBuilder content = new StringBuilder();

        // Number of strings: always 2 digits
        String count = String.format("%02d", strs.size());

        for (String s : strs) {
            // Each string length: always 3 digits
            lengths.append(String.format("%03d", s.length()));
            content.append(s);
        }

        return count + lengths + content;
    }

    public List<String> decode(String encoded) {
        List<String> result = new ArrayList<>();

        // Read the number of strings
        int count = Integer.parseInt(encoded.substring(0, 2));

        // Length metadata starts after the 2-digit count
        int lengthIndex = 2;

        // Content starts after all 3-digit length blocks
        int contentIndex = 2 + count * 3;

        for (int i = 0; i < count; i++) {
            int stringLength = Integer.parseInt(
                encoded.substring(lengthIndex, lengthIndex + 3)
            );

            lengthIndex += 3;

            String decodedString = encoded.substring(
                contentIndex,
                contentIndex + stringLength
            );

            result.add(decodedString);
            contentIndex += stringLength;
        }

        return result;
    }
}