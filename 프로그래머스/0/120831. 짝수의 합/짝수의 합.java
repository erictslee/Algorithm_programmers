class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n>0&&n<=1000){
            int j=0;
            for(int i=0; i<=n/2; i++){
                j=2*i;
                answer=answer+j;
            }
        }else{
            System.out.println("fuck");
        }
        return answer;
    }
}