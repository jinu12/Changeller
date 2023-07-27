public class Quiz2 {

    // 사관마다 심사하는데 걸리는 시간은 다릅니다.
    // 하지만 더 빨리 끝나는 심사대가 있으면 기다렸다가 그곳으로 가서 심사를 받을 수도 있습니다.
    // 모든 사람이 심사를 받는데 걸리는 시간을 최소로 하고 싶습니다.

    // 7분이 되었을 때, 첫 번째 심사대가 비고 3번째 사람이 심사를 받습니다.

    // 10분이 되었을 때, 두 번째 심사대가 비고 4번째 사람이 심사를 받습니다.

    // 14분이 되었을 때, 첫 번째 심사대가 비고 5번째 사람이 심사를 받습니다.

    // 20분이 되었을 때, 두 번째 심사대가 비지만 6번째 사람이 그곳에서 심사를 받지 않고 1분을 더 기다린 후에
    // 첫 번째 심사대에서 심사를 받으면 28분에 모든 사람의 심사가 끝납니다.

    public static void main(String[] args) {
        // 심사할 인원
        int n = 6;
        // 심사 위원이 심사 하는 시간
        int[] times = { 7, 10 };
        // 걸리는 시간
        System.out.println(jolra_gine(times, n));

    }

    static public int jolra_gine(int[] times, int n) {
        // 결과 값
        int result = 0;
        // 심사할 인원 바로 처음에 두 심사인원이 처음에 + 2
        int i = 2;
        while (i < n + 1) {

            // 1번 심사 인원이 걸리는 시간
            result += times[0];
            // 시간 테스트
            // System.out.println(result);
            // 심사를 다했으므로 심사 인원한 사람 + 1
            i++;
            // 시간 테스트
            // System.out.println(i);
            // 두번째 심사 인원이 심사한 시간
            result += (times[1] - times[0]);
            // 심사를 다했으므로 심사 인원한 사람 + 1
            i++;
            // 20분이 되면 심사인원 2가 심사 안하고 1분 쉬고 심사인원1이 심사하므로 구현
            if (result == 20) {
                // 1분 기달리기
                result += 1;
                // 심사원 1이 걸리는 시간
                result += times[0];
                // 완료
                i++;
            }
        }

        return result;

    }

}