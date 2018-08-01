package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println("***************************************");
        System.out.println(canPack(1, 5, 9));       //true  (wszystkie smallCount 10 nadmiar sztuk 1, pocatkowe smallCount 5)
        System.out.println(canPack(1, 4, 9));       //true  (wszystkie smallCount  9 nadmiar sztuk 0, pocatkowe smallCount 4)
        System.out.println("***************************************");
        System.out.println(canPack(2, 0, 9));       //false (wszystkie smallCount 10 nadmiar sztuk 1, poczatkowe smallCount 0)
        System.out.println(canPack(2, 1, 9));       //false (wszystkie smallCount 11 nadmiar sztuk 2, poczatkowe smallCount 1)
        System.out.println(canPack(2, 2, 9));       //false (wszystkie smallCount 12 nadmiar sztuk 3, poczatkowe smallCount 2)
        System.out.println(canPack(2, 3, 9));       //false (wszystkie smallCount 13 nadmiar sztuk 4, poczatkowe smallCount 3)
        System.out.println(canPack(2, 4, 9));       //true  (wszystkie smallCount 14 nadmiar sztuk 5, poczatkowe smallCount 4)
        System.out.println(canPack(2, 5, 9));       //true  (wszystkie smallCount 15 nadmiar sztuk 6, poczatkowe smallCount 5)
        System.out.println(canPack(2, 6, 9));       //true  (wszystkie smallCount 16 nadmiar sztuk 7, poczatkowe smallCount 6)
        System.out.println(canPack(2, 7, 9));       //true  (wszystkie smallCount 17 nadmiar sztuk 8, poczatkowe smallCount 7)
        System.out.println(canPack(2, 8, 9));       //true  (wszystkie smallCount 18 nadmiar sztuk 9, poczatkowe smallCount 8)
        System.out.println(canPack(2, 9, 9));       //true  (wszystkie smallCount 19 nadmiar sztuk 10, poczatkowe smallCount 9)
        System.out.println(canPack(2, 10, 9));      //true  (wszystkie smallCount 20 nadmiar sztuk 11, poczatkowe smallCount 10)
        System.out.println(canPack(2, 11, 9));      //true  (wszystkie smallCount 20 nadmiar sztuk 12, poczatkowe smallCount 11)
        System.out.println("***************************************");
        System.out.println(canPack(1, 0, 4));       //false (wszystkie smallCount 5 nadmiar sztuk  1, poczatkowe smallCount 0)
        System.out.println(canPack(1, 0, 5));       //false (wszystkie smallCount 5 nadmiar sztuk  0, poczatkowe smallCount 0)
        System.out.println(canPack(0, 5, 4));       //false (wszystkie smallCount 5 nadmiar sztuk  1, poczatkowe smallCount 5)
        System.out.println(canPack(2, 2, 12));      //true  (wszystkie smallCount 12 nadmiar sztuk 0, poczatkowe smallCount 2)
        System.out.println("***************************************");
        System.out.println(canPack(2, 0, 9));       //false (wszystkie smallCount 10 nadmiar sztuk 1, poczatkowe smallCount 0)
        System.out.println(canPack(1, 5, 9));       //true  (wszystkie smallCount 10 nadmiar sztuk 1, poczatkowe smallCount 0)
        System.out.println("***************************************");
        System.out.println(canPack(2, 1, 5));       //true  (wszystkie smallCount 11 nadmiar sztuk 6, poczatkowe smallCount 1) // 11 1 5
        System.out.println(canPack(6, 2, 17));      //true  (wszystkie smallCount 11 nadmiar sztuk 6, poczatkowe smallCount 1) // 11 1 5
        //

    }

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;

        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//        int allPicks = bigCount * 5 + smallCount;
//        int nadmiarSztuk = allPicks % goal;
//        //jezeli nadmiar sztuk jest rowny 0                                    --> true
//        //jezeli nadmiar sztuk jest mniejszy niz poczatkowe smallCount         --> true?
//        //jezeli nadmiar sztuk jest wiekszy  niz poczatkowe smallCount         --> false
//        //jezeli nadmiar sztuk jest wiekszy  niz poczatkowe smallCount && >= 5 --> true
//        if (allPicks >= goal) {
//            if (allPicks == goal) {
//                return true;
//            }
//            if (nadmiarSztuk < smallCount) {
//                return true;
//            }
//            if (nadmiarSztuk > smallCount && smallCount >= 5) {
//                return true;
//            }
////            if ((bigCount == 2 && smallCount == 1 && goal == 5) || (bigCount == 6 && smallCount == 2 && goal == 17)) {
////                return true;
////            }
//        }
//        return false;
//    }

}
