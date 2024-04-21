# Siguri e të dhënave

### 1.Homphonic Substitution Cipher


### 2.Rail Fence Cipher
The Rail Fence Cipher is a simple encryption technique that uses transposition to rearrange text based on a specified key, which is the number of rows; this method arranges the characters in a zigzag pattern across a series of rows, with more rows resulting in a "deeper" zigzag.<br>
* Encryption<br>
In the encryption phase, the text to be encrypted is written in a zigzag pattern across the number of rows specified by the key. This process involves moving up and down in a zigzag manner to organize the characters. Once the characters are arranged, the encrypted text is read line by line and joined into a single string.<br>
* Decryption<br>
Decryption involves reconstructing the same zigzag structure to restore the original order of characters. First, an auxiliary matrix is created with the number of rows matching the key and the number of columns matching the length of the encrypted text. Marks are made to indicate the zigzag path that the encrypted text follows, serving as placeholders for where the characters of the encrypted text will be placed, using the '*' character. The encrypted text is placed in these marked locations in the correct sequence. Finally, the reading of the text follows the zigzag pattern to retrieve the message in its original form.<br>
Steps to execute<br>
  - Create a class named RailFence.java
  - Run the program
  - Choose the option you need
  - Enter text based on the selected option( plaintext to encrypt or cipher text to decrypt)
  - Enter the key
  - See the results
    
  
### 3.Morse Code Cipher



EXAMPLES FROM EXECUTION<br>
1. Homphonic Substitution Cipher
   ![homophonic cipher](https://github.com/fatjetagashi/Siguri_te_dhenave_Gr5/assets/154750535/3fa2cc55-a991-4b00-953b-8929c67dfc0c)

   ![code mappings](https://github.com/fatjetagashi/Siguri_te_dhenave_Gr5/assets/154750535/ca38620b-2509-4f95-89ab-f05a325f8898)



   
2. Rail Fence Cipher
   
![RailFence](https://github.com/fatjetagashi/Siguri_te_dhenave_Gr5/assets/154750535/3ac5d3ca-0705-4416-a5f4-a540b00317f8)

![rail fencee](https://github.com/fatjetagashi/Siguri_te_dhenave_Gr5/assets/154750535/0f3436c1-b564-4566-89fa-089d2a87b8ce)


3. Morse Code Cipher

![morse cipher](https://github.com/fatjetagashi/Siguri_te_dhenave_Gr5/assets/154750535/c9b39d54-9189-4c00-bdb5-d7a5e8e247d3)

![morsee cipher](https://github.com/fatjetagashi/Siguri_te_dhenave_Gr5/assets/154750535/2b8b8667-2b60-415f-9b96-173f38a36853)








   
   
   


