# 🔐 Caesar Cipher ASCII Algorithm

This Java project implements a Caesar Cipher algorithm that works with ASCII values within a specified range (32 to 126). It performs encryption and decryption by shifting each character by a specified numeric key, working with a broader set of characters than just the alphabet.

## 🚀 Getting Started

Follow these instructions to set up and run the project on your local machine.

### Prerequisites
- Java JDK installed on your machine
- Git for cloning the repository

### Installation and Setup

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/SameerNadaf/CaesarCipherASCII
   ```

2. **Navigate to the Project Directory:**

   ```bash
   cd CaesarCipherAlgorithm
   ```

3. **Compile the Java Code:**

   ```bash
   javac com/CaesarCipherAlgorith/Encryption/EncryptionRunner.java com/CaesarCipherAlgorith/Decryption/DecryptionRunner.java
   ```

4. **Run the Application:**

   - To encrypt a message:

     ```bash
     java com.CaesarCipherAlgorith.Encryption.EncryptionRunner
     ```

   - To decrypt a message:

     ```bash
     java com.CaesarCipherAlgorith.Decryption.DecryptionRunner
     ```

## 📂 Project Structure

The project follows a modular structure to separate encryption and decryption logic:

- **src/**: Contains the Java source code files.
- **com.CaesarCipherAlgorith/**
  - **Encryption/**: Contains the encryption logic (`Encryption.java`).
  - **Decryption/**: Contains the decryption logic (`Decryption.java`).

## 🔑 How It Works

- **Encryption**: Shifts each character within the ASCII range (32 to 126) by a specified numeric key.
- **Decryption**: Reverses the encryption by shifting characters back by the same key.

### ASCII Range

This Caesar Cipher implementation restricts itself to ASCII values from 32 to 126, allowing encryption of a wide set of printable characters, including letters, numbers, and symbols.

## 📦 Features

- Encrypts a given text by shifting each character's ASCII value.
- Decrypts an encrypted message back to its original form.
- Supports any printable ASCII character from 32 to 126.

## 🌐 Technologies Used

- Java

## 📘 Example Usage

### Encrypting and Decrypting Text

```plaintext
Enter the text: Hello, World!
Enter the key: 5
```

**Output:**

```plaintext
Encrypted text: Mjqqt1%[twqi&
Decrypted text: Hello, World!
```

## 🤝 Contributing

Contributions are welcome! Feel free to submit issues or open pull requests to improve the code or documentation.

# Happy coding! 🎉
