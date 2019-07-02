package main.java.com.stackroute.pe3;

public class RemoveVowels {
    /*
     * this function takes a string array as an input and returns an output string array after removing all
     * the vowels from the strings
     */
    public String[] removeVowelsInAGivenWord(String word[]) {
        for (int i = 0; i < word.length; i++)

             /*checks if a charater is a vowel
            If it is a vowel it skips the character and adds it to the output String*/

            word[i] = word[i].replaceAll("[aeiouAEIOU]", "");
        return word;
    }
}
