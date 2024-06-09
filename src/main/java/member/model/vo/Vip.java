package member.model.vo;

public class Vip extends Member implements Buyable {

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculatePoint() {
        return super.calculatePoint() * 0.1;
    }

    @Override
    public int buy(int price) {
        return (int)(price * 0.9);
    }
}
