package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Homework 1
        byte mu = 2;
        short mc = 3;
        int chelsea = 4;
        long liverpool = 5;
        float goalsScoredPerGameOnAverage = 95.5f;
        double goalsConcededPerGameOnAverage = 46.5;
        char g = 33;
        boolean muIsChampion = mu>1;
        System.out.println (g);
        System.out.println ("Manchester United is a Champion? " +  muIsChampion);

        // Homework 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double weightOfAllBoxers = firstBoxer + secondBoxer;
        double weightDifference = firstBoxer - secondBoxer;
        System.out.println("Total weight of boxers = " + weightOfAllBoxers + "kg");
        System.out.println ("The difference in weight is " + weightDifference + "kg");

        // Homework 3
        byte bananas = 5;
        byte weightBanana = 80;
        int weightBananas = bananas * weightBanana;
        short milk = 200;

        int weightMilk = milk/100 * 105;
        byte icecream = 2;
        short icecreamPack = 100;
        int weightIcecream = icecream * icecreamPack;
        byte eggs = 4;
        int eggWeight = 70;
        int weightEggs = eggs * eggWeight;
        float weightBreakFastG = weightBananas + weightEggs + weightIcecream + weightMilk;
        float weightbreakfastkg = weightBreakFastG / 1000;
        System.out.println ("Bananas weight = " + weightBananas + "g");
        System.out.println ("Milk weight = " + weightMilk +  "g");
        System.out.println ("Icecream weight = " + weightIcecream +  "g");
        System.out.println ("Eggs weight = " + weightEggs +  "g");
        System.out.println ("Breakfast weight in grams = " + weightBreakFastG +  "g");
        System.out.println ("Breakfast weight in kilograms = " + weightbreakfastkg +  "kg");




        // Homework 4
        byte excessWeight = 7;
        short firstDiet = 250;
        short secondDiet = 500;
        int firstDietDays = excessWeight*1000/firstDiet;
        int secondDietDays = excessWeight*1000/secondDiet;
        int averageDays = (firstDietDays+secondDietDays)/2;
        System.out.println("250 grams per days before the result = " + firstDietDays + " days");
        System.out.println("500 grams per days before the result = " + secondDietDays + " days");
        System.out.println("On average days before the result = " + averageDays + " days");

        // Homework 5



    }
}
