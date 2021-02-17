
public class Solution {
    public int[] solution(int[] A, int K) {
        if (K == A.length)
            return A;
        if (A.length == 0 || A.length == 1)
            return A;

        int rotations = K % A.length;

        int[] temp = new int[A.length];
        for (int i = 0; i < A.length; i++){
            if (i + rotations == A.length)
                break;
            temp[i+rotations] = A[i];
        }
        for (int i = 0; i < rotations; i++) {
            temp[rotations-i-1] = A[A.length-i-1];
        }

        return temp;
    }
}
