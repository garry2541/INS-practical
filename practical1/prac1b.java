package com.mycompany.prac1;
import java.util.Scanner;
public class prac1adecrypt {
    public static void main(String[] args) {
        String message, DecryptMessage = "";
        int key;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an cipher text message: ");
        message = sc.nextLine();
        System.out.println("Enter decryption Key: ");
        key = sc.nextInt();
        for(int i = 0; i < message.length(); i++){
            ch = message.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char) (ch - key);
                if(ch < 'a'){
                    ch = (char) (ch - 'a' + 'z' + 1);
                }
                DecryptMessage = DecryptMessage + ch;
            }
            else if(Character.isUpperCase(ch)){
                ch = (char)(ch - key);
                if(ch < 'A'){
                    ch = (char)(ch - 'A' + 'Z' + 1);
                }
                DecryptMessage = DecryptMessage + ch;
            }
            else{
                DecryptMessage = DecryptMessage + ch;
            }
        }
        System.out.println("Decrypted Message: " + DecryptMessage);
    }
}
