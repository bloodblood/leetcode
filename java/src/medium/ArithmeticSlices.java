package medium;

public class ArithmeticSlices {
    class Solution {
        public int numberOfArithmeticSlices(int[] A) {
            int count = 0;
            for(int s = 0; s < A.length - 2; s++){
                int d = A[s + 1] - A[s];
                for(int i = s + 2; i < A.length; i++){
                    int temp = 0;
                    for(temp = s + 1; temp <= i; temp++)
                        if(A[temp] - A[temp - 1] != d)
                            break;
                    if(temp > i)
                        count++;
                }
            }
            return count;
        }
    }
}
