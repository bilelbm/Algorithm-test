class Solution {
    public int[] solution(int[] A, int[] B) {
        int max = 0;
        for(int val: A){
            if(val > max){
                max = val;
            }
        }
        int[] steps = new int[max+1];
        steps[0] = 1;steps[1] = 1;
        for(int i = 2;i <= max; i++){
        	steps[i] = (steps[i-1] + steps[i-2]) % (int)Math.pow(2, 30);
        }
        int[] results = new int[A.length];
        for(int j = 0; j < A.length; j++){
            results[j] = steps[A[j]] % (int)Math.pow(2, B[j]);
        }
        return results;
    }
}