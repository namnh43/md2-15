package exception;

import java.util.Random;
import java.util.Scanner;

public class OutboundException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input index:");
        int index = scanner.nextInt();
        Integer[] arr = createRandom();
        try {
            int num = arr[index];
            System.out.println("Number at index "+index+" is:" + num);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Grateful finish");
    }
    public static Integer[] createRandom() {
        Random random = new Random();
        Integer arr[] = new Integer[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }
}
