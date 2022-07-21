// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String ff = "1556666633322";
        System.out.println(summing(ff));
    }
    
    
    public static List<Character> summing (String word){
        Map<Character, Integer> count =  new HashMap<Character, Integer>();
        char[] wordArray = new char[word.length()];
        for (int s= 0; s<word.length(); s++ ){
             wordArray[s] = word.charAt(s);
        }
        
        for(char a: wordArray){
            if(!count.containsKey(a)){
              count.put(a, 1) ;
            } else if(count.containsKey(a)){
                count.put(a, count.get(a)+1);
            }
            
        }

//sorts a map by the value in reverse orderand puts them into a list of keys only of the top 3 values
        int s=3;
        List<Character> sortedChar = count.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .map(Map.Entry::getKey)
        .limit(s)
        .collect(Collectors.toList());
        
        return sortedChar;
    }
        
}

