public class ListOfInteger {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                System.out.println("Given number is odd: " + number[i]);
            } else {
                System.out.println("Given number is even: " + number[i]);
            }
        }
    }
}
