# Siguri e të dhënave

### 1.Homphonic Substitution Cipher
This program implements a homophonic substitution encryption and decryption algorithm.
The algorithm uses a unique mapping between letters of the alphabet and a set of four-digit codes to encrypt and then decrypt messages<br>
* Encryption<br>
In the Homophonic Substitution Cipher, each letter of the plaintext is replaced with a value from a set of values that correspond to that letter. These codes are predefined, and each letter can have one or more different values to choose from, depending on the frequency of usage in the source language. This variety of codes for a single letter helps to hide the frequency of letter usage, making decoding without the key more difficult. The encryption process selects a random value from the set of codes for each letter in the text and appends these codes to form the encrypted message.
* Decryption<br>
During the decryption phase, the process occurs in reverse. The encrypted message, which is a string of codes or values, is split into segments that match the codes used during encryption. Each code in the encrypted message is mapped back to its corresponding letter based on a predefined hash map created during the encryption phase. In this way, the original text is restored from the encrypted message by using the mapping from codes (values) to letters.<br>
Steps to execute<br>
 - Create a class named HomophonicCipher.java
    - Run the program
    - Enter the plaintext to encrypt
    - See encrypted and then decrypted text,as well as code mappings for each letter


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








   
   
   


