import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float users_money;
        boolean works = true;
        int test = 0;

        ArrayList<Float> machine_money = new ArrayList<>();

        BigDecimal five = new BigDecimal("5");
        BigDecimal two = new BigDecimal("2");
        BigDecimal one = new BigDecimal("1");
        BigDecimal zero_five = new BigDecimal("0.5");
        BigDecimal zero_two = new BigDecimal("0.2");
        BigDecimal zero_one = new BigDecimal("0.1");
        BigDecimal zero_zero_five = new BigDecimal("0.05");
        BigDecimal zero_zero_two = new BigDecimal("0.02");
        BigDecimal zero_zero_one = new BigDecimal("0.01");

        machine_money.add(5f);
        for(int i=0;i<3;i++){
            machine_money.add(2f);
        }
        for(int i=0;i<5;i++){
            machine_money.add(1f);
        }
        for(int i=0;i<10;i++){
            machine_money.add(0.5f);
        }
        for(int i=0;i<20;i++){
            machine_money.add(0.2f);
        }
        for(int i=0;i<200;i++){
            machine_money.add(0.1f);
        }
        for(int i=0;i<100;i++){
            machine_money.add(0.05f);
        }
        for(int i=0;i<100;i++){
            machine_money.add(0.02f);
        }
        for(int i=0;i<10000;i++){
            machine_money.add(0.01f);
        }

//        for(int i=0;i<10000;i++){
//            machine_money.add(0.01f);
//        }


//        Collections.sort(machine_money, Collections.reverseOrder());

        Scanner scan = new Scanner(System.in);

//      na testa

        while (works == true) {

            users_money = scan.nextFloat();

            if (users_money == 0 || users_money < 0) {

                works = false;

            } else {
                int variable = 0;
                float value = machine_money.get(0);
                int counter = 0;
                while (variable < machine_money.size()) {



                    float substraction = users_money - machine_money.get(variable);
                    substraction = Math.round(substraction * 100);
                    substraction = substraction / 100;

                    if (substraction > 0) {

                        users_money = users_money - machine_money.get(variable);
                        users_money = Math.round(users_money * 100);
                        users_money = users_money / 100;

                        if (value == machine_money.get(variable)) {

                            counter++;

                        } else {
                            if (counter > 0) {
                                if (value > 1 || value == 1) {

                                    System.out.println("Wydaj " + counter + " monet " + value + " zł");

                                } else {

                                    System.out.println("Wydaj " + counter + " monet " + value + " gr");

                                }
                            }

                            counter = 1;
                            value = machine_money.get(variable);

                        }
                        System.out.println(users_money);
                        machine_money.remove(variable);

                    } else if (users_money - machine_money.get(variable) < 0) {

                        variable++;

//                        if (counter > 1){
//
////                            float last_coin = machine_money.get(variable);
//
//                            if (value > 1 || value == 1) {
//
//                                System.out.println("Wydaj " + counter + " monet " + value + " zł");
//
//                            } else {
//
//                                System.out.println("Wydaj " + counter + " monet " + value * 100 + " gr");
//
//                            }
//                            counter = 1;
//                        }

                    } else {

                        //                        users_money = users_money - machine_money.get(variable);
                        //                        users_money = Math.round(users_money*100);
                        //                        users_money= users_money/100;

                        users_money = users_money - machine_money.get(variable);
                        users_money = Math.round(users_money * 100);
                        users_money = users_money / 100;

                        if (value == machine_money.get(variable))
                            counter++;

                        if (value > 1 || value == 1) {

                            System.out.println("Wydaj " + counter + " monet " + value + " zł");

                        } else {

                            System.out.println("Wydaj " + counter + " monet " + value * 100 + " gr");

                        }

//                        if (users_money==0){
//
//                            float last_coin = machine_money.get(variable);
//
//                            if (last_coin > 1 || last_coin == 1) {
//
//                                System.out.println("Wydaj 1 monete " + last_coin + " zł");
//
//                            } else {
//
//                                System.out.println("Wydaj 1 monete " + last_coin * 100 + " gr");
//
//                            }
//
//                        }


                        counter = 1;
//                        counter = 0;

                        machine_money.remove(variable);

                        value = machine_money.get(variable);

                        if (Math.round(users_money) == 0) {
                            break;
                        }
                    }

                }
                test++;
            }

        }

//        System.out.println(test);

    }
}