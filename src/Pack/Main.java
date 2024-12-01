package Pack;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp1 = new MovablePoint(2,4,1,1);
        mp1.moveUp();
        MovableCircle mc1 = new MovableCircle(1, 2, 5, 1, 1);
        mc1.moveUp();
        System.out.println(mc1.toString());
        MovableRectangle mr1 = new MovableRectangle(1,1,5,1, 2,2);
        mr1.moveDown();
        System.out.println(mr1.toString());
    }
}
