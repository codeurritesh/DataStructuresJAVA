public class minmaxsum {
    public static void main(String[] args) {
        int[] input1 = {1, 4, 3, 2};
        int[] input2 = {1, 4, 3, 4,4};

        double average1 = findAverageMinMax(input1);
        double average2 = findAverageMinMax(input2);

        System.out.println("Output 1: " + average1);
        System.out.println("Output 2: " + average2);
    }

    public static double findAverageMinMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sumMax = 0;
        int sumMin = 0;
        int countMax = 0;
        int countMin = 0;

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
                sumMin = num;
                countMin = 1;
            } else if (num == smallest) {
                sumMin += num;
                countMin++;
            }

            if (num > largest) {
                largest = num;
                sumMax = num;
                countMax = 1;
            } else if (num == largest) {
                sumMax += num;
                countMax++;
            }
        }

        return (double) (sumMin + sumMax) / (countMin + countMax);
    }
}
