import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HuffmanTree{

    //make a method that reads the text file and returns an array list of the treenodes
    public static ArrayList<TreeNode> readFile(String filename) throws IOException{

        //creat a lsit that will store the tree node
        ArrayList<TreeNode> list = new ArrayList<>();

        //make a filereader that reads the file
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        //loop through the file and read the file line by line
        String eachLine;

        while((eachLine = bufferedReader.readLine()) != null){
            //split the file into 2 parts 
            String[] splits = eachLine.split("\\s+");
            
            //take the letter from the left side the we split and turn it into a char
            char symbol = splits[0].charAt(0);

            //take the right side of the split and o=convert it to an int
            int freq = Integer.parseInt(splits[1]);

            //Create an object using bopth the letter and the int(freq)
            TreeNode node = new TreeNode(freq, symbol);

            //then we add the node to the arraylist
            list.add(node);
        }
        bufferedReader.close();

        return list;
         
    }

    public static int findMin(ArrayList<TreeNode> list){

        //stores smallest frequency and index
        int smallFrequency = list.get(0).getFreq();
        int smallIndex = 0;

        //loop through the list
        //for each loop check the frequency
        for(int i = 0; i < list.size(); i++){

            //if u find a node with a smaller frequency uupdate the frequency and index
            if (list.get(i).getFreq() < smallFrequency) {
                smallFrequency = list.get(i).getFreq();
                smallIndex = i;
            }

        }
        //then return index tells us which has lowest index
        return smallIndex;
    }

    public static TreeNode BuildTree(ArrayList<TreeNode> list){

        //put everty char into a list as a treenode
        while (list.size() > 1) {

            //find the 2 smallest frequencies
            int i1 = findMin(list);
            TreeNode n1 = list.remove(i1);

            int i2 = findMin(list);
            TreeNode n2 = list.remove(i2);
            //add the 2 smallest frequencies into anode

            int parentNode = n1.getFreq() + n2.getFreq();

            TreeNode parent = new TreeNode(parentNode, '*', n1, n2);

            //add that node bto the list
            list.add(parent);
            
        }

        return list.get(0);

    }
    private static String codeNum(TreeNode node, char current, String code){
        //check if no more characters 
        if (node == null) {
            return null;
        }

        //check if the node has no children and checl if the leaf symbolmatches the current char and if it has the binary paths 
        if (node.getLeft() == null && node.getRight() == null && node.getSymbol() ==  current){
            return code;
        
        }

        //search the right tree, if its right add 1 to the path
        String right = codeNum(node.getRight(), current, code + "1");

        //if the char was found on the right return and if not on the lef tu search the left and add 0 to the path
        if(right != null){
            return right;
        }
        return codeNum(node.getLeft(), current, code + "0");
        
    }
    public static String Encode(TreeNode root, String string){

        //make a stringbuilder to store the encoded string
        StringBuilder encodedCode = new StringBuilder();

        //loop through the characters of the string we wanna encode
        for(int i = 0; i < string.length(); i++){
            //get cureetn character we to to find the code for
            char current = string.charAt(i);
            
            //call codeNum method to ghet the path for the har and add to the final string
            encodedCode.append(codeNum(root, current, ""));

        }
        return encodedCode.toString();
    }

    public static String Decode(TreeNode root, String code){

        //store the final decoded characters
        StringBuilder finalAns = new StringBuilder();
        
        //start at the root of the tree
        TreeNode curr = root;
        //look in each code in the encoded string
        for(int i = 0; i < code.length(); i++){
            char codes = code.charAt(i);
            
            //checks if its 0 and if it is it goes left 
            if (codes == '0') {
                curr = curr.getLeft();
            }
            //if its 1 go right
            else if (codes == '1') {
                curr = curr.getRight();
            }

            //when there is no more children it will be null if we reach then we found the character
            if (curr.getLeft() == null && curr.getRight() == null) {

                //add the symbol/ char to the decoded message
                finalAns.append(curr.getSymbol());

                //restart from the root and move to the next char
                curr = root;
            }
        }

        //retrun the decoded message
        return finalAns.toString();

    }

}