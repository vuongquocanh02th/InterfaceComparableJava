import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.5);
        circles[1] = new Circle();
        circles[2] = new Circle(1.6, "blue", false);
        System.out.println("Before sorting: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator comparator = new CircleComparator();
        Arrays.sort(circles, comparator);
        System.out.println("After sorting: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
