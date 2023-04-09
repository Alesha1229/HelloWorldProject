package homework.h6;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        CreditCards card1 = new CreditCards(10,1234);
        CreditCards card2 = new CreditCards(20,5678);
        CreditCards card3 = new CreditCards(30,9012);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose card");
        System.out.println("1)Card1");
        System.out.println("2)Card2");
        System.out.println("3)Card3");
        int chooseCard = scanner.nextInt();
        if (chooseCard == 1) {
            System.out.print("Money:");
            System.out.println(card1.getMoney());
            System.out.print("Bank account:");
            System.out.println(card1.getBankAcc());
            System.out.println("Choose an action:");
            System.out.println("1)Add money");
            System.out.println("2)Get money");
            System.out.println("3)Info");
            int chooseAction = scanner.nextInt();
            if (chooseAction == 1) {
                System.out.println("How much money will add?");
                System.out.println("1)+20");
                System.out.println("2)+50");
                System.out.println("3)+100");
                int chooseAddMoney = scanner.nextInt();
                if (chooseAddMoney == 1) {
                    card1.addMoney(+20);
                } else if (chooseAddMoney == 2) {
                    card1.addMoney(+50);
                } else if (chooseAddMoney == 3) {
                    card1.addMoney(+100);
                }

            } else if (chooseAction == 2) {
                System.out.println("How much money will get?");
                System.out.println("1)-20");
                System.out.println("2)-50");
                System.out.println("3)-100");
                int chooseGetMoney = scanner.nextInt();
                if (chooseGetMoney == 1) {
                    card1.addMoney(+20);
                } else if (chooseGetMoney == 2) {
                    card1.addMoney(+50);
                } else if (chooseGetMoney == 3) {
                    card1.addMoney(+100);
                }
            }
                else if (chooseAction == 3) {
                System.out.print("Money:");
                System.out.println(card1.getMoney());
                System.out.print("Bank account:");
                System.out.println(card1.getBankAcc());
            }
                else if (chooseAction == 4) {
                    return;
            }




        } else if (chooseCard == 2) {
            System.out.print("Money:");
            System.out.println(card2.getMoney());
            System.out.print("Bank account:");
            System.out.println(card2.getBankAcc());
            System.out.println("Choose an action:");
            System.out.println("1)Add money");
            System.out.println("2)Get money");
            System.out.println("3)Info");
            int chooseAction = scanner.nextInt();
            if (chooseAction == 1) {
                System.out.println("How much money will add?");
                System.out.println("1)+20");
                System.out.println("2)+50");
                System.out.println("3)+100");
                int chooseAddMoney = scanner.nextInt();
                if (chooseAddMoney == 1) {
                    card2.addMoney(+20);
                } else if (chooseAddMoney == 2) {
                    card2.addMoney(+50);
                } else if (chooseAddMoney == 3) {
                    card2.addMoney(+100);
                }

            } else if (chooseAction == 2) {
                System.out.println("How much money will get?");
                int chooseGetMoney = scanner.nextInt();
                if (chooseGetMoney == 1) {
                    card2.addMoney(+20);
                    System.out.println("1)-20");
                    System.out.println("2)-50");
                    System.out.println("3)-100");
                } else if (chooseGetMoney == 2) {
                    card2.addMoney(+50);
                } else if (chooseGetMoney == 3) {
                    card2.addMoney(+100);
                }
            } else if (chooseAction == 3) {
                System.out.print("Money:");
                System.out.println(card2.getMoney());
                System.out.print("Bank account:");
                System.out.println(card2.getBankAcc());
            }
        }else if (chooseCard == 3) {
                System.out.print("Money:");
                System.out.println(card3.getMoney());
                System.out.print("Bank account:");
                System.out.println(card3.getBankAcc());
                System.out.println("Choose an action:");
                System.out.println("1)Add money");
                System.out.println("2)Get money");
                System.out.println("3)Info");
                int chooseAction = scanner.nextInt();
                if (chooseAction == 1){
                    System.out.println("How much money will add?");
                    System.out.println("1)+20");
                    System.out.println("2)+50");
                    System.out.println("3)+100");
                    int chooseAddMoney = scanner.nextInt();
                    if(chooseAddMoney == 1){
                        card3.addMoney(+20);
                    } else if (chooseAddMoney == 2) {
                        card3.addMoney(+50);
                    } else if (chooseAddMoney == 3) {
                        card3.addMoney(+100);
                    }

                } else if (chooseAction == 2) {
                    System.out.println("How much money will get?");
                    System.out.println("1)-20");
                    System.out.println("2)-50");
                    System.out.println("3)-100");
                    int chooseGetMoney = scanner.nextInt();
                    if (chooseGetMoney == 1) {
                        card3.addMoney(+20);
                    } else if (chooseGetMoney == 2) {
                        card3.addMoney(+50);
                    } else if (chooseGetMoney == 3) {
                        card3.addMoney(+100);
                    }
                }else if(chooseAction == 3){
                    System.out.print("Money:");
                    System.out.println(card3.getMoney());
                    System.out.print("Bank account:");
                    System.out.println(card3.getBankAcc());
                }


            }

            
        }


    }





