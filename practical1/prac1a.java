package com.mycompany.prac1;
import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {
        int key;
        char ch;
        String message, encryptedMessage="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Plain Text:");
        message = sc.nextLine();
        System.out.println("Enter key:");
        key = sc.nextInt();
        for(int i=0;i<message.length();i++){
            ch=message.charAt(i);
            if(Character.isLowerCase(ch)){
                ch=(char)(ch+key);
                if(ch>'z'){
                    ch=(char)(ch-'z'+'a'-1);
                }
                encryptedMessage = encryptedMessage + ch;
            }
            else if(Character.isUpperCase(ch)){
                ch=(char)(ch+key);
                if(ch>'Z'){
                    ch=(char)(ch-'Z'+'A'-1);
                }
                encryptedMessage = encryptedMessage + ch;
            }else{
                encryptedMessage =encryptedMessage + ch;
            }
        }
        System.out.println("Encrypted Message :"+encryptedMessage);
       
    }
}
