package member.model.vo;

public class Gold extends Member implements Buyable {

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }


    @Override
    public double calculatePoint() {
        return super.calculatePoint() * 0.05;
    }

    @Override
    public int buy(int price) {
        return (int) (price * 0.95);
    }
}
