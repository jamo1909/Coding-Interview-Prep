import java.util.HashMap;

/**
 * @Author James Murphy (Jmurph08)
 **/
public class isAnagram {
    public boolean isAnagram(String stringOne, String stringTwo) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char characterOne : stringOne.toCharArray()) {
            charCount.put(characterOne, charCount.getOrDefault(characterOne, 0) + 1);
        }

        for (char characterTwo : stringTwo.toCharArray()) {
            charCount.put(characterTwo, charCount.getOrDefault(characterTwo, 0) - 1);
        }

        for (int val : charCount.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
