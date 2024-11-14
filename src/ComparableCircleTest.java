import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(5);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(15,"fuck",false);
        System.out.println("Before sorting:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After sorting:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
