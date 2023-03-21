package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int j = 0; j < sideLength; j++) {
            System.out.print('8');
        }
        for (int i = 1; i < sideLength - 1; i++) {
            System.out.println();
            System.out.print('8');
            for (int j = 0; j < sideLength - 1; j++) {
                System.out.println();
            }
            System.out.println('8');
            System.out.println();
        }
        for (int j = 0; j < sideLength; j++) {
            System.out.print('8');
        }
    }
}
