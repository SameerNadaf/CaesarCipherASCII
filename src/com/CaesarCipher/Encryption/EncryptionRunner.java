package com.CaesarCipher.Encryption;

import java.util.Scanner;

public class EncryptionRunner {
    public static void main(String[] args) {

        Encryption encryption = new Encryption();
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("------ Try playing with Caesar Cipher algorithm ------");
        System.out.println();
        System.out.print("Please enter message : ");
        String message = scanner.nextLine();
        System.out.print("Please enter key : ");
        int key = scanner.nextInt();
        scanner.close();

        encryption.encryptionAlgorithm(message, key);
    }
}
