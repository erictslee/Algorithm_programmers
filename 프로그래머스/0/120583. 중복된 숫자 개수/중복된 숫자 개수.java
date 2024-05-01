class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        if((1<=array.length)&&(array.length<=100)&&(0<=n)&&(n<=1000)){
            for(int element:array){
                if(n==element){
                    answer++;
                }
                
            }
        }
        return answer;
    }
}