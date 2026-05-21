public class num {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, 0};

        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                pos++;

            } else if (arr[i] < 0) {
                neg++;

            } else {
                zero++;
            }
        }

        System.out.println("Positive : " + pos);
        System.out.println("Negative : " + neg);
        System.out.println("Zero : " + zero);
    }
} 