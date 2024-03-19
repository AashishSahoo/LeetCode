class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        
        // Populate the magazineMap with characters from magazine
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
        
        // Check if ransomNote can be constructed using characters from magazine
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false; // If character not found in magazine or already used
            }
            magazineMap.put(c, magazineMap.get(c) - 1); // Mark character as used
        }
        
        return true;
    }
}