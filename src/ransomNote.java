import java.util.HashMap;

/**
 * @Author James Murphy (Jmurph08)
 **/
public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magCharCount = new HashMap<>(); //Declare Hash Table

        for(char magChar : magazine.toCharArray()){ //Loop through the characters in the magazine string
            magCharCount.put(magChar, magCharCount.getOrDefault(magChar, 0) + 1); //Put the character into the hashtable as the key with the number of occurrence updated
        }

        for(char ranChar: ransomNote.toCharArray()){ //Loop through the characters in the ransom note
            if(!magCharCount.containsKey(ranChar) || magCharCount.get(ranChar) <= 0){ //If the letter does not exist in the hash table or the letter occurs less that 0
                return false;
            }
            magCharCount.put(ranChar, magCharCount.get(ranChar) - 1); //deduct the count of each letter
        }
        return true;

    }
}
