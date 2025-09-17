import java.util.Scanner;

class duplicate_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide size of elements:");
        int size = sc.nextInt();
        boolean[] visited = new boolean[size];

        int[] arr = new int[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 Frequency count
        System.out.println("\nFrequencies:");
        for (int i = 0; i < size; i++) {
            if (visited[i])
                continue;

            int count = 0;

            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }

        // 🔹 Remove duplicates
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
