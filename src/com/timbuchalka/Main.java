package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(6, 0, 29));     //false
        //if goal % 5 != 0
        System.out.println(canPack(5, 4, 29));     //true
        System.out.println(canPack(5, 5, 29));     //true

        System.out.println(canPack(5, 3, 29));     //false
        System.out.println(canPack(0, 5, 4));     //true
        System.out.println(canPack(0, 5, 4));     //true
        System.out.println(canPack(4, 25, 43));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //parameter bigCount represents the count of big flour bags(5kilo each)
        //parameter smallCount represents the count of small flour bags(1kilo each)
        //parameter goal represents the goal amount of kilos of flour needed to assemble a package
        //the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal
        //the method should return true if its possible to make a package with g oal kilos of flour
        //if the sum is greater than goal, ensure that only full bags are used towards the goal amount.
        //For example if goal=9, bigCount = 2, smallCount = 0

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int goalDivision = goal / 5; // 29/5 = 5
        int remainderExtract = goal % 5; //29%5 = 4
        int total = bigCount * 5 + smallCount;

        if (total >= goal) {
            if (goalDivision > remainderExtract) {
                return false;
            }
            return true;
        }
        return false;
    }

    //what makes it possible to pack? the fact that you can have
    //28/6 = 4 and 4/6
    //6*5+2=32

    //goal 28: at least 5 big 3 small but 5 big and 4 small is also ok however 6 big/0 small is not ok, but 6 big and 3 small is ok
    //goal 59 at least 11 big and 4 small
    /*
    initial check: is it even enough?
    big count * 5 + small count = ?
    20 + 25 = 45 > 43 <--so far so good
    45 % 43 = 2 <--
    40 + 5 = 43
     */
}
