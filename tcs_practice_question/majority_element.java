public class majority_element {
    public static void main(String[] args) {

        int[] arr = {3,3,4,2,3,3,3};

        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for(int num : arr) {
            if(count == 0) {
                candidate = num;
            }

            if(num == candidate)
                count++;
            else
                count--;
        }

        // Step 2: Verify
        count = 0;
        for(int num : arr) {
            if(num == candidate)
                count++;
        }

        if(count > arr.length / 2)
            System.out.println("Majority Element: " + candidate);
        else
            System.out.println("No Majority Element");
    }
}