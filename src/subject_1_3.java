abstract class rank {
    abstract String getRank();

    abstract double getDiscount();

    abstract double getPoint();

}

class Silver extends rank {

    public String getRank() {
        return "[Silver]";
    }

    public double getDiscount() {
        return 0.1;
    }

    public double getPoint() {
        return 0.1;
    }

}

class Gold extends rank {

    public String getRank() {
        return "[Gold]";
    }

    public double getDiscount() {
        return 0.2;
    }

    public double getPoint() {
        return 0.2;
    }

}

class Vip extends rank {

    public String getRank() {
        return "[VIP]";
    }

    public double getDiscount() {
        return 0.3;
    }

    public double getPoint() {
        return 0.3;
    }

}

interface printResult {
    int getTotalDiscountMoney();

    int getAddedPoint();

}

class user implements printResult {

    private rank r;
    private String name;
    int purchase;
    int point = 0;

    user(String name, int purchase, rank r) {
        this.name = name;
        this.purchase = purchase;
        this.r = r;
    }

    String getUserName() {
        return this.name;
    }

    public String getUserRank() {
        return this.r.getRank();
    }

    public int getPurchase() {
        return this.purchase;
    }

    public int getPoint() {
        return this.point;
    }

    double getDiscountRatio() {
        return this.r.getDiscount();
    }

    double getPointRatio() {
        return this.r.getPoint();
    }

    @Override
    public int getTotalDiscountMoney() {
        return (int) (this.purchase * (1 - this.r.getDiscount()));
    }

    @Override
    public int getAddedPoint() {
        this.point += (int) (this.purchase * this.r.getPoint());
        return (int) (this.purchase * this.r.getPoint());
    }
}

public class subject_1_3 {
    public static void main(String[] args) {

        Silver silver = new Silver();
        Gold gold = new Gold();
        Vip vip = new Vip();

        user lss = new user("이순신", 10000, silver);
        user ssid = new user("신사임당", 10000, gold);
        user hgd = new user("홍길동", 10000, vip);
        user leg = new user("이율곡", 10000, silver);
        user kus = new user("김유신", 10000, gold);
        user ku = new user("권율", 10000, vip);

        printDiscountAnswer(lss);
        printDiscountAnswer(ssid);
        printDiscountAnswer(hgd);
        printPointAnswer(leg);
        printPointAnswer(kus);
        printPointAnswer(ku);
    }

    public static void printDiscountAnswer(user name) {
        System.out.println(name.getUserRank() + " 안녕하세요. " + name.getUserName() + " 회원님. 회원님의 " + "할인율은 " + name.getDiscountRatio() + "입니다. \n지불할 금액:" + name.getTotalDiscountMoney());
    }

    public static void printPointAnswer(user name) {
        System.out.println(name.getUserRank() + " 안녕하세요. " + name.getUserName() + " 회원님. 회원님의 " + "적립률은 " + name.getPointRatio() + "입니다. \n보너스 포인트" + name.getAddedPoint() +
                "가 적립되었습니다. 현재 보너스 포인트 " + name.getPoint() + "\n지불할 금액:" + name.getPurchase());
    }
}