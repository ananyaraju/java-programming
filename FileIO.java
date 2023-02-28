import java.io.*;
import java.util.*;

public class FileIO 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        try(BufferedReader br = new BufferedReader(new FileReader("cat2_file.txt")))
          {
            String line;
            while((line = br.readLine()) != null)
              {
                String[] words = line.split(" ");
                for (String word : words) {
                    Integer val = wordCount.get(word);
                    if (val == null)
                        wordCount.put(word, 1);
                    else            
                        wordCount.put(word, val + 1);
                }    
            }
            System.out.println(wordCount);
        }
         catch(Exception e){
            e.printStackTrace();
        }

        TreeMap<String, Integer> sordtedWordCount = new TreeMap<String, Integer>(wordCount);        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("cat2_out.txt")))
        {
            for (Map.Entry<String, Integer> entry : sordtedWordCount.entrySet())
            {
                  bw.write(entry.getKey() + ": " + entry.getValue());
                  bw.newLine();
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}