package Lab4.Q2;
import java.util.ArrayList;

public class Q2 {
    public static void Test(ArrayList<? extends Shape> arraylist){
        for (Shape shape : arraylist){
            shape.draw();
        }
    }
    public static void main(String[] args) {
        ArrayList<Rectangle> RectArrList = new ArrayList<Rectangle>();
        RectArrList.add(new Rectangle());
        RectArrList.add(new Rectangle());

        ArrayList<Circle> CircArrList = new ArrayList<Circle>();
        CircArrList.add(new Circle());
        CircArrList.add(new Circle());

        Test(CircArrList);
        Test(RectArrList);
    }
}
