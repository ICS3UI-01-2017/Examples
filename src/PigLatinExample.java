
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class PigLatinExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to use as input
        Scanner input = new Scanner(System.in);
        
        // ask for a word to translate
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
        // convert to lowercase
        word = word.toLowerCase();
        
        // see if word starts with a vowel
        if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") 
                || word.startsWith("o") || word.startsWith("u")){
            // add "way" to the end of the word
            String translated = word + "way";
            // tell the user the translation
            System.out.println(word + " in pig latin is " + translated);
        }else{
            // not a vowel, special rule time
            // find the first vowel by going through each letter
            for(int i = 0; i < word.length(); i++){
                // look for a vowel at spot i
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' 
                        || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                    // chop the word up at the vowel
                    String front = word.substring(0, i);
                    String ending = word.substring(i);
                    // assemble translation
                    String translated = ending + front + "ay";
                    // tell the user the translation
                    System.out.println(word + " in pig latin is " + translated);
                    // stop looking for vowels!
                    break;
                }
            }
            
            
            
        }
    }
    
}
