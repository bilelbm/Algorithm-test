class Solution {
    public int[] solution(int N, int[] A) {
        int max = 0;
        int min = 0;
        int[] counters = new int[N];
        for(int val: A){
         if(val >= 1 && val<= N){
             counters[val - 1] = Math.max(counters[val - 1], min) + 1;
             if(max < counters[val - 1])
                max = counters[val - 1]; 
         }else{
             min = max;
         }
        }
        for(int i = 0; i< counters.length; i++){
         counters[i] = Math.max(counters[i], min); 
        }
        return counters;
    }
}