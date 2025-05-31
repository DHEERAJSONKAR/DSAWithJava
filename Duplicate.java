
public class Duplicate {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 6};
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate array is:" + array[i]);
                }
            }
        }

    }
}
