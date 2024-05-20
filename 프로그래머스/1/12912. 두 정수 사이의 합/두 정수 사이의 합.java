class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i=0;
        int start=Math.min(a,b);
        int end=Math.max(a,b);
        for(i=start; i<=end; i++){
            answer=answer+i;
        }
        return answer;
    }
}