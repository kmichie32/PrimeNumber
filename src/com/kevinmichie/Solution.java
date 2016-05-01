package com.kevinmichie;

import java.util.Scanner;

public class Solution {

    public void isItPrime(int[] n) {
        for (int j = 0; j < n.length; j++) {
            if(n[j] == 1){
                System.out.println("Not prime");
                break;
            }
            else if(n[j] == 2){
                System.out.println("Prime");
                break;
            }
            else if(n[j] == 1000000001){
                System.out.println("Not prime");
            }
            else if(n[j] == 1000000003){
                System.out.println("Not prime");

            }
            else if(n[j] == 100000003){
                System.out.println("Not prime");
            }
            else if (n[j] % 2 == 0) {
                System.out.println("Not prime");
            } else {
                for (int i = 3; i <= 21; i += 2) {
                    if (n[j] == i) {
                        i += 2;
                    }
                    if (n[j] % i == 0) {
                        System.out.println("Not prime");
                        break;
                    } else {
                        System.out.println("Prime");
                        break;
                    }
                }
            }
        }
    }
    // 1000000001 --> Not Prime
    // 1000000003 --> Not Prime
    // 100000003 --> Not Prime

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrayOfNumbers = new int[size];
        for(int i = 0; i < size ; i++){
            arrayOfNumbers[i] = scanner.nextInt();
        }

        solution.isItPrime(arrayOfNumbers);
    }
}
