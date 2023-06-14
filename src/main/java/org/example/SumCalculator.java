package org.example;

public class SumCalculator {

    public int sum(int number){
        if(number > 0){
            int sum = 0;
            for(int i = 1; i <= number; i++){
                sum += i;
            }
            return sum;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}