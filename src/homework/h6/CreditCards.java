package homework.h6;

public class CreditCards {
    private int money;
    private int bankAcc;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(int bankAcc) {
        this.bankAcc = bankAcc;
    }

    public CreditCards(int money, int bankAcc) {
        this.money = money;
        this.bankAcc = bankAcc;
    }

        public void addMoney(int addMoney){
            money += addMoney;
            System.out.println("+" + addMoney);
        }
    public void getMoney(int getMoney){
        money -= getMoney;
        System.out.println("-" + getMoney);
    }

    }



