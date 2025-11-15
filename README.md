# Huffman Tree Project (Java)

This project is a simple implementation of a Huffman Tree used for text compression.  
It is written in **Java** and follows the assignment rules (no PriorityQueue, no HashMap).

## Files in This Project

**Main.java**  
- Reads the frequency file (LetterCountAscending.txt)  
- Creates the Huffman tree  
- Allows the user to encode text or decode bitstrings  

**HuffmanTree.java**  
- Builds the Huffman tree using the two lowest frequencies  
- Generates binary codes for each character  
- Contains the encode and decode methods  

**TreeNode.java**  
- The node class provided for the assignment  
- Stores a character, its frequency, and left/right child references  

This project demonstrates basic Java, file reading, binary trees, and recursion.
