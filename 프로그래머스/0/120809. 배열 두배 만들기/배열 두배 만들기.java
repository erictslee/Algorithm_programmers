class Solution {
    public int[] solution(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] *= 2; // 각 원소의 값을 두 배로 증가시킴
        }
        return numbers; // 수정된 배열 반환
    }
}
