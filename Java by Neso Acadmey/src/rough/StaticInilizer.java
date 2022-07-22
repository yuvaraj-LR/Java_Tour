package src.com.java.rough;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInilizer {
        public static int H;
        public static int B;
        public static boolean flag = condition(H, B);

        public static boolean condition(int H, int B){
            Scanner sc = new Scanner(System.in);

            H = sc.nextInt();
            B = sc.nextInt();

            if (H<0 || B<0){
                return flag = true;
            }
            else{
                return flag = false;
            }
        }
        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main

    }//end of class



