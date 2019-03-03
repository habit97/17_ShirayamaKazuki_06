package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=0;
//        int word=10;

        System.out.println("わからなかった単語と意味を入力して下さい。");
        System.out.println("例）クラス　オブジェクトの元となる設計書");


        System.out.println("単語と意味を入力して下さい。”e”で終了します。");
        String word=scanner.next();
        String meaning=scanner.next();


        while(!(word.equals("e"))){
            System.out.println("単語と意味を入力して下さい。”e”で終了します。");
            word = scanner.next();
            meaning = scanner.next();
            a++;
        }


        scanner.close();
        System.out.println("");
//        for(i=0;i<i;i++)
//            System.out.println("単語；"+word[i]+"　意味；"+meaning[i]);
        System.out.println(a+1 + "件 登録されました。");
        }
    }



//配列ができていない

