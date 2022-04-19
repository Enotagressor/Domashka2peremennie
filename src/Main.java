public class Main {
    public static void main(String[] args) {
       // Zadanie 1
       byte ferrari = 1;
       short subaru = 12;
       int toiota = 135;
       long lada = 1_200L;
       float capacityEngine = 2.5f;
       double turboCharging = 1.8;
       char  lowOilLevel = 33;
       boolean autoInSalon = false;

       // Zadanie 2
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов = " + weightTotal + " кг!");
        float weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница веса бойцов составляет " + weightDifference + " кг!");


        // Zadanie 3
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int breakfastWeight = bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        System.out.println("Общий вес завтрака спортсмена составляет " + breakfastWeight + " грамм");
        int perevodGrKg = 1000;
        float breakfastInKg = breakfastWeight / (float)perevodGrKg;
        System.out.println("Вес завтрака в кг составляет: " + breakfastInKg);

        // Zadanie 4
        byte lowWeightKg = 7;
        int lowWeightGramm = lowWeightKg * perevodGrKg;
        short programmDiet1 = 250;
        short programmDiet2 = 500;
        int dayDiet1 = lowWeightGramm / programmDiet1;
        int dayDiet2 = lowWeightGramm / programmDiet2;
        System.out.println("Для похудения на 7кг по программе 1 потребуется " + dayDiet1 + " дней. Для похудения на 7кг по программе 2 требуется " + dayDiet2 + " дней");
        int averageDayDiet = (dayDiet1 + dayDiet2) / 2;
        System.out.println("В среднем на похудение потребуется " + averageDayDiet + " день");

        // Zadanie 5
        int zpMasha = 67_760;
        int zpDenis = 83_690;
        int zpKristina = 76_230;
        float x = 10f / 100f;
        float promotionZpMasha = zpMasha + zpMasha * x;
        float promotionZpDenis = zpDenis + zpDenis * x;
        float promotionZpKristina = zpKristina  + zpKristina * x;
        byte monht = 12;
        float difYearMasha = (promotionZpMasha -zpMasha)  * monht;
        float difYearDenis = (promotionZpDenis - zpDenis) * monht;
        float difYearKristina = (promotionZpKristina - zpKristina) * monht;
        System.out.println("Маша теперь получает " + promotionZpMasha + " рублей. Годовой доход вырос на " + difYearMasha + " рублей");
        System.out.println("Денис теперь получает " + promotionZpDenis + " рублей. Годовой доход вырос на " + difYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + promotionZpKristina + " рублей. Годовой доход вырос на " + difYearKristina + " рублей");







    }
}