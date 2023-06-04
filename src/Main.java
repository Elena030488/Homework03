public class Main {
    public static void main(String[] args) {
        //Задача 1.
        int a1 = 300000;
        byte b1 = 100;
        short c1 = 10000;
        long d1 = 10000000000L;
        float e1 =  2.25f;
        double f1 = 5.125846584;
        System.out.println("Значение переменной a1 с типом int = " + a1);
        System.out.println("Значение переменной b1 с типом byte = " + b1);
        System.out.println("Значение переменной c1 с типом short = " + c1);
        System.out.println("Значение переменной d1 с типом long = " + d1);
        System.out.println("Значение переменной e1 с типом float = " + e1);
        System.out.println("Значение переменной f1 с типом double = " + f1);
        //Задача 2.
        float a2 = 27.12f;
        long b2 = 987678965549L;
        float c2 = 2.786f;
        short d2 = 569;
        short e2 = -159;
        short f2 = 27897;
        byte g2 = 67;
        //Задача 3.
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short totalPaper = 480;
        int totalStudents = teacher1 + teacher2 + teacher3;
        float paperForOneStudent = (float) totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");
        //Задача 4.
        byte machineOutIn2Min = 16;
        byte machineOutIn1Min = 16/2;
        System.out.println("За минуту " + machineOutIn1Min + " бутылок");
        short machineOutIn20Min = 20 * 8;
        short machineOutIn1Day = 24 * 60 * 8;
        int machineOutIn3Day = 24 * 3 * 60 * 8;
        int machineOutIn1Month = 24 * 31 * 60 * 8;
        System.out.println("За 20 минут машина произвела " + machineOutIn20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + machineOutIn1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machineOutIn3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machineOutIn1Month + " штук бутылок");
        //Задача 5.
        byte totalCans = 120;
        byte for1Classroom = 2 + 4;
        int totalClassrooms = totalCans / for1Classroom;
        int whiteColorCans = totalClassrooms * 2;
        int brownColorCans = totalClassrooms * 4;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + whiteColorCans + " банок белой краски и " + brownColorCans + " банок коричневой краски.");
        //Задача 6.
        byte oneBananaWeight = 80;
        byte onePortionMilkWeight = 105;
        byte onePortionIceCreamWeight = 100;
        byte oneEggWeight = 70;
        int sportsBreakfastG = oneBananaWeight * 5 + onePortionMilkWeight * 2 + onePortionIceCreamWeight * 2 + oneEggWeight * 4;
        float sportsBreakfastKg = sportsBreakfastG / 1000f;
        System.out.println("Вес спортивного завтрака =  " + sportsBreakfastG + " граммов или " + sportsBreakfastKg + " килограммов");
        //Задача 7.
        byte lessWeightKg = 7;
        short lessWeightG = 7 * 1000;
        short prog1 = 250;
        short prog2 = 500;
        int totalDaysProg1 = lessWeightG / prog1;
        int totalDaysProg2 = lessWeightG / prog2;
        System.out.println("При потере 250 граммов в день спортсмен похудеет за " + totalDaysProg1 + " дней");
        System.out.println("При потере 500 граммов в день спортсмен похудеет за " + totalDaysProg2 + " дней");
        int totalDaysOnAverage = (totalDaysProg1 + totalDaysProg2) / 2;
        System.out.println("В среднем спортсмену может потребоваться на похудение " + totalDaysOnAverage + " день");
        //Задача 8.
        int payInMonthMasha = 67760;
        int payInMonthDenis = 83690;
        int payInMonthChristina = 76230;
        int payInMonthIncreaseMasha = payInMonthMasha * 110 / 100;
        int payInMonthIncreaseDenis = payInMonthDenis * 110 / 100;
        float payInMonthIncreaseChristina = payInMonthChristina * 1.1f;
        int payInYearDiffMasha = payInMonthIncreaseMasha * 12 - payInMonthMasha * 12;
        int payInYearDiffDenis = payInMonthIncreaseDenis * 12 - payInMonthDenis * 12;
        float payInYearDiffChristina = payInMonthIncreaseChristina * 12 - payInMonthChristina * 12;
        System.out.println("Маша теперь получает " + payInMonthIncreaseMasha + " рублей. Годовой доход вырос на " + payInYearDiffMasha + " рублей.");
        System.out.println("Маша теперь получает " + payInMonthIncreaseDenis + " рублей. Годовой доход вырос на " + payInYearDiffDenis + " рублей.");
        System.out.println("Маша теперь получает " + payInMonthIncreaseChristina + " рублей. Годовой доход вырос на " + payInYearDiffChristina + " рублей.");

    }
}