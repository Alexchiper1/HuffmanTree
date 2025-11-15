# Huffman Coding – Text Compression (Java)

This project implements a full Huffman Coding system in Java for the **Data Structures & Algorithms** Assignment.  
The goal is to compress and decompress text using variable-length binary codes based on character frequencies.

The project includes:

✔ Building a **Huffman Tree** (reference-based binary tree, no priority queues or hashmaps allowed)  
✔ Encoding messages into binary using the tree  
✔ Decoding binary strings back into text  
✔ A **Java GUI** for user interaction  
✔ A detailed set of test cases and analysis  

---

## 📌 Part 1 — Generating the Huffman Tree

The Huffman Tree is constructed using:

- A list/ADT list of TreeNode objects
- Each TreeNode stores:
  - Character
  - Frequency
  - Left child
  - Right child

Process:

1. Insert all characters and frequencies into a list.
2. Repeatedly:
   - Find the **two nodes with the lowest frequency**
   - Merge them into a parent node:
     - `parent.frequency = left.frequency + right.frequency`
   - Replace the two nodes with the parent node in the list
3. Continue until only one node remains → this is the **root**.

Left branch = `0`  
Right branch = `1`

---

## 📌 Part 2 — Encoding

To encode a message:

1. For each character:
   - Traverse the Huffman Tree from root to leaf
   - Append `"0"` when going left
   - Append `"1"` when going right
2. Concatenate all codes to form the final binary string.

Compression ratio is displayed using 7-bit ASCII as the fixed-length baseline:

