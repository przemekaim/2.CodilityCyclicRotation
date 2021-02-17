public class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0 || K == A.length)
            return A;

        int rotations = K % A.length;
        int[] temp = new int[A.length];

        for (int i = 0; i < A.length - rotations; i++)
            temp[i + rotations] = A[i];

        for (int i = 1; i <= rotations; i++)
            temp[rotations - i] = A[A.length - i];

        /*for (int i = 0; i < A.length; i++) {
            temp[(i + K) % A.length] = A[i];
        }*/
        return temp;
    }
}
