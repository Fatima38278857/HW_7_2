public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 6");

        double Schet_3 = 15_000; // Cумма на счёте в банке;
        int month_3 = 1;
        while (month_3 <= 108) {
            Schet_3 = Schet_3 + Schet_3 * 0.07;
            Schet_3 = Math.round(Schet_3 * 100.0) / 100.0;
            if (month_3 % 6 == 0) {
                System.out.println("Сумма накоплений " + Schet_3 + " руб. Месяц " + month_3);
            }
            month_3++;


        }


        System.out.println("Задание 7");

        int Friday = 6;
        for (; Friday < 31; Friday = Friday + 7) {
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо поготовить отчёт.");


        }

        // Блок 3
        System.out.println("Задание 8");


        int cometFliesBy = 79;
        int OurYear = 2022;
        for (; cometFliesBy <= 2132; cometFliesBy = cometFliesBy + 79) {
            if (cometFliesBy > 1817 && cometFliesBy <= OurYear) {
                System.out.println(cometFliesBy + "год. Пролетела комета");

            }
            if (cometFliesBy > OurYear && cometFliesBy < 2132) {
                System.out.println(cometFliesBy + "год. Ещё разок залетит");


                System.out.println("Задание 9");

                for (int a = 1; a <= 10; a++) {
                    System.out.println("2 * " + a + " = " + a * 2);


                }

            }

        }
    }
}




