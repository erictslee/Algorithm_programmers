class Solution {
    public int solution(int num) {
        int count = 0;
        long n = num;  // num을 long 타입으로 변환하여 오버플로우 방지

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            count++;

            if (count == 500) {
                return -1;
            }
        }
        return count;
    }
}
