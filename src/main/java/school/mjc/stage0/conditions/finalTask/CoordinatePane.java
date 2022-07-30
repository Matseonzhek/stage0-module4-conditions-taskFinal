package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        int quadrant = x == 0 && y == 0 ? 0 : x > 0 && y > 0 ? 1 : x < 0 && y > 0 ? 2 : x < 0 && y < 0 ? 3 : 4;
        switch (quadrant) {
            case (0) -> System.out.println("zero");
            case (1) -> System.out.println("first");
            case (2) -> System.out.println("second");
            case (3) -> System.out.println("third");
            case (4) -> System.out.println("fourth");
        }
    }
}
