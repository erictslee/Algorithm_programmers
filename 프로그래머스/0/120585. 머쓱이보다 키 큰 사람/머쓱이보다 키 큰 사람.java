class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int element:array){
            if(element>height){
                answer++;
            }else{
                answer=0;
            }
        }
        return answer;
    }
}