package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while(number <= finishNumber) {
            number++;

            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is: " + number);
            evenNumberFound++;
            if(number ==5) {
                break;
            }

        }
        System.out.println("even number found: " + evenNumberFound);


    }

    public static boolean isEvenNumber(int number)
    {
        if((number%2) == 0) {
            return true;
        }else {
            return false;
        }
    }}
