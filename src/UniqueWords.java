import java.util.ArrayList;
import java.util.HashSet;
public class UniqueWords
{
   /*
    						counts the number of unique strings in a list
							@param list ArrayList of strings to be examined
							@return number of unique strings in the list
    */
   public static int countUnique(ArrayList<String> list)
   {
	 /*Removed for loop from method because it kept returning an incorrect number of 
	  * unique words (3 to be specific). I tried Boolean, adding a second condition 
	  * statement and counter. Implemented a Hashing instead because it counts
	  * the frequency of a unique word and ignores duplicate words. 
	  */
	   
	  HashSet<String> uniqueWords = new HashSet<>(list);
      return uniqueWords.size();
   }
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<>();
      words.add("apple");
      words.add("orange");
      words.add("blackboard");
      words.add("apple");
      words.add("orange");
      words.add("sun");
      words.add("moon");

      int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
