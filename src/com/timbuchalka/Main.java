package com.timbuchalka;

public class Main {

//    private static final FIVE_KILOS=5;
//    private static final ONE_KILO=1;

    public static void main(String[] args) {
//        canPack(1, 0, 4);
//        canPack(1, 0, 5);
//        canPack(0, 5, 4);
//        canPack(2, 2, 12);
//        canPack(-3, 2, 12);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //parameter bigCount represents the count of big flour bags(5kilo each)
        //parameter smallCount represents the count of small flour bags(1kilo each)
        //parameter goal represents the goal amount of kilos of flour needed to assemble a package
        //the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal
        //the method should return true if its possible to make a package with g oal kilos of flour
        //if the sum is greater than goal, ensure that only full bags are used towards the goal amount.
        //For example if goal=9, bigCount = 2, smallCount = 0

        // goal is the capacity of the bag
//        bigCount *= 5;
//        smallCount *= 1;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int total = 0;

        if (goal <= total) {
            return true;
        }
        return false;
    }

}
/*
1,0,4
1,0,5
0,5,4
2,2,12
-3,2,12

 */