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
        System.out.println(canPack(1, 0, 4));       //false  (wszystkie smallCount 5 nadmiar sztuk  1, poczatkowe smallCount 0)
        System.out.println(canPack(1, 0, 5));       //false  (wszystkie smallCount 5 nadmiar sztuk  0, poczatkowe smallCount 0)
        System.out.println(canPack(0, 5, 4));       //false  (wszystkie smallCount 5 nadmiar sztuk  1, poczatkowe smallCount 5)
        System.out.println(canPack(2, 2, 12));      //true   (wszystkie smallCount 12 nadmiar sztuk 0, poczatkowe smallCount 4)
        System.out.println("***************************************");
        System.out.println(canPack(2,0,9));         //false  (wszystkie smallCount 10 nadmiar sztuk 1, poczatkowe smallCount 0)
        System.out.println(canPack(1,5,9));         //true   (wszystkie smallCount 10 nadmiar sztuk 1, poczatkowe smallCount 0)
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int allPicks = bigCount * 5 + smallCount;
        int nadmiarSztuk = allPicks % goal;
        //jezeli nadmiar sztuk jest rowny 0                                    --> true
        //jezeli nadmiar sztuk jest mniejszy niz poczatkowe smallCount         --> true?
        //jezeli nadmiar sztuk jest wiekszy  niz poczatkowe smallCount         --> false
        //jezeli nadmiar sztuk jest wiekszy  niz poczatkowe smallCount && >= 5 --> true
        if (allPicks >= goal) {
            if (allPicks == goal) {
                return true;
            }
            if (nadmiarSztuk < smallCount) {
                return true;
            }
            if (nadmiarSztuk > smallCount && smallCount >= 5) {
                return true;
            }
        }
        return false;
    }
}
