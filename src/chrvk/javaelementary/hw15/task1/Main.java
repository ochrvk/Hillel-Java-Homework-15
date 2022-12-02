package chrvk.javaelementary.hw15.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    private static final int Size = 10;
    private static final int min = 10;
    private static final int max = 20;
    private static final int diff = (max - min) + 1;

    public static void main(String[] args) {
        int[] array = new int[Size];
        Random random = new Random();
        for (int i = 0; i < Size; i++) {
          array[i] = random.nextInt(diff + min);
        }
        IntStream streamFromArrays = Arrays.stream(array);
        System.out.println(streamFromArrays.map((s) -> s * s).average());
    }
}
