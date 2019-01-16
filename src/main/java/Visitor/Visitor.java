package Visitor;

public class Visitor {
    private int age, height;
    private double money;

    public Visitor(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void spendMoney(double cost){
        this.money -= cost;
    }
}
