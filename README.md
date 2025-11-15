# Huffman Coding – Text Compression (Java)

This project is an implementation of **Huffman Coding**, a well-known data-compression algorithm used to reduce the size of text by assigning shorter binary codes to more frequent characters.  
The goal is to build a **reference-based binary Huffman Tree** using a frequency table, then use that tree to **encode** (text → bits) and **decode** (bits → text) messages.

---

## 📌 Language & Technologies Used
- **Java** (Core Java / Console Application)
- No external libraries
- No PriorityQueue or HashMap (as required)
- Uses:
  - Classes & Objects
  - Reference-based Binary Trees
  - Recursion
  - File Reading (BufferedReader)
  - ArrayList for storing nodes

---

## 📌 Project Files
This project uses 3 Java files:

1. **Main.java**  
   - Reads the frequency file `LetterCountAscending.txt`  
   - Builds a list of TreeNodes  
   - Creates the HuffmanTree  
   - Provides a simple console menu for encoding and decoding

2. **HuffmanTree.java**  
   - Builds the Huffman Tree manually by repeatedly combining the two lowest-frequency nodes  
   - Generates binary codes via recursive tree traversal  
   - Encodes text  
   - Decodes binary strings  

3. **TreeNode.java**  
   - A simple node class provided by the lecturer  
   - Stores:
     - A symbol (letter)
     - Frequency
     - Left child (0)
     - Right child (1)

---

## 📌 Input File
The project reads from:

**LetterCountAscending.txt**

Format:
