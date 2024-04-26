class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double num1_d=(double) num1;
        double num2_d=(double) num2;
        double answer_2=0;
        if((num1>0&&num1<=100)&&(num2>0&&num2<=100)){
            answer_2=num1_d/num2_d*1000;
            
            answer=(int)answer_2;
        }
        return answer;
    }
}