import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class HuffmanTree{

    private TreeNode root;
    private String[] codes = new String[128];

    public static void fileReader(String filename) throws IOException{
        Stack<String> letter = new Stack<>();
        Stack<Integer> frequency = new Stack<>();

        BufferedReader read = new BufferedReader(new FileReader("LetterCountAscending.txt"));
        String line;

        while ((line = read.readLine()) != null) {
            String[] parts = line.split("\\s+");
            if (parts.length == 2) {
                letter.add(parts[0]);
                frequency.add(Integer.parseInt(parts[1]));
            }
        }
        read.close();
        
    }
    public static void BuildTree(){
        
        //we need to get 2 smallest from the text and add them make a method
        //those 2 we add to the end of the list and the sum of them into the list in ascending order

    
    }
    public static void findMin(){
        

    }

    public static void Encode(){

    }
    public static void Decode(){

    }
     public static void main(String[] args) {
 
        

     }

}