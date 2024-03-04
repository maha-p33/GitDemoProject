package collections;

import java.util.HashMap;

public class AnagramMapper {
    public static int[] anagramMappings(int[] A, int[] B) {
        // Create a mapping from elements of B to their indices
        HashMap<Integer, Integer> indexMapB = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            indexMapB.put(B[i], i);
        }

        // Create the result array using the mapping
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = indexMapB.get(A[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        int[] result = anagramMappings(A, B);

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
