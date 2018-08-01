package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println("***************************************");
        System.out.println(canPack(1, 5, 9));      //true  (wszystkie smallCount 10 nadmiar sztuk 1, pocatkowe smallCount 5)
        System.out.println(canPack(1, 4, 9));      //true  (wszystkie smallCount  9 nadmiar sztuk 0, pocatkowe smallCount 4)
        System.out.println("***************************************");
        System.out.println(canPack(2, 0, 9));      //false (wszystkie smallCount 10 nadmiar sztuk 1, poczatkowe smallCount 0)
        System.out.println(canPack(2, 1, 9));      //false (wszystkie smallCount 11 nadmiar sztuk 2, poczatkowe smallCount 1)
        System.out.println(canPack(2, 2, 9));      //false (wszystkie smallCount 12 nadmiar sztuk 3, poczatkowe smallCount 2)
        System.out.println(canPack(2, 3, 9));      //false (wszystkie smallCount 13 nadmiar sztuk 4, poczatkowe smallCount 3)
        System.out.println("***************************************");
        System.out.println(canPack(2, 4, 9));      //true  (wszystkie smallCount 14 nadmiar sztuk 5, poczatkowe smallCount 4)
        System.out.println(canPack(2, 5, 9));      //true  (wszystkie smallCount 15 nadmiar sztuk 6, poczatkowe smallCount 5)
        System.out.println(canPack(2, 6, 9));      //true  (wszystkie smallCount 16 nadmiar sztuk 7, poczatkowe smallCount 6)
        System.out.println(canPack(2, 7, 9));      //true  (wszystkie smallCount 16 nadmiar sztuk 7, poczatkowe smallCount 6)
        System.out.println(canPack(2, 8, 9));      //true  (wszystkie smallCount 16 nadmiar sztuk 7, poczatkowe smallCount 6)
        System.out.println(canPack(2, 9, 9));      //true  (wszystkie smallCount 16 nadmiar sztuk 7, poczatkowe smallCount 6)
        System.out.println("***************************************");
        System.out.println(canPack(2, 1, 5));      //true  (wszystkie smallCount 11 nadmiar sztuk 6, poczatkowe smallCount 5)
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int allPicks = bigCount * 5 + smallCount;
//        int rest = allPicks % 5;
//        int iloscPalet = allPicks / 5;
        int nadmiarSztuk = allPicks % goal;
        //jezeli nadmiar sztuk jest rowny 0  niz poczatkowe smallCount         --> true
        //jezeli nadmiar sztuk jest mniejszy niz poczatkowe smallCount         --> true?
        //jezeli nadmiar sztuk jest wiekszy  niz poczatkowe smallCount         --> false
        //jezeli nadmiar sztuk jest wiekszy  niz poczatkowe smallCount && >= 5 --> true
        if (allPicks >= goal) {
            if (nadmiarSztuk < smallCount) {
                return true;
            }
            if (nadmiarSztuk > smallCount && smallCount >= 5) {
                return true;
            }
            if (allPicks == goal) {
                return true;
            }
        }
        return false;
    }
}

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        //parameter bigCount represents the count of big flour bags(5kilo each)
//        //parameter smallCount represents the count of small flour bags(1kilo each)
//        //parameter goal represents the goal amount of kilos of flour needed to assemble a package
//        //the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal
//        //the method should return true if its possible to make a package with g oal kilos of flour
//        //if the sum is greater than goal, ensure that only full bags are used towards the goal amount.
//        //For example if goal=9, bigCount = 2, smallCount = 0
//
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//        int goalDivision = goal / 5; // 29/5 = 5
//        int remainderExtract = goal % 5; //29%5 = 4
//        int total = bigCount * 5 + smallCount;
//
//        if (total >= goal) {
//            if (goalDivision > remainderExtract) {
//                return false;
//            }
//            return true;
//        }
//        return false;
//    }


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

