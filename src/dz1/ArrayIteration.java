package dz1;

public class ArrayIteration {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, null, 5};


        System.out.println("Используем do...while:");
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);


        System.out.println("Используем while:");
        i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }


        System.out.println("Используем for:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }


        System.out.println("Используем foreach:");
        for (Integer num : array) {
            System.out.println(num);
        }

        System.out.println("Каждый второй");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 != 0) {
                System.out.println(array[j]);
            }
        }

        System.out.println("Каждый второй и выход если null");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 != 0) {
                if (array[j] == null) {
                    break;
                }

                System.out.println(array[j]);
            }
        }
    }
}
