import java.util.*;

public class Quiz1 {

    // 준비된 상자에 카드를 한 장씩 넣고, 상자를 무작위로 섞어 일렬로 나열합니다. \
    // -> 초반 입력값 int[] cards = { 8, 6, 3, 7, 2, 5, 1, 4 }
    // 상자가 일렬로 나열되면 상자가 나열된 순서에 따라 1번부터 순차적으로 증가하는 번호를 붙입니다.
    // -> 인덱스 번호

    // 그 다음 임의의 상자를 하나 선택하여 선택한 상자 안의 숫자 카드를 확인합니다.
    // -> 처음 인덱스 값 즉 cards[0] = 8
    // 다음으로 확인한 카드에 적힌 번호에 해당하는 상자를 열어 안에 담긴 카드에 적힌 숫자를 확인합니다.
    // -> 그다음은 cards[8] = 4
    // 마찬가지로 숫자에 해당하는 번호를 가진 상자를 계속해서 열어가며, 열어야 하는 상자가 이미 열려있을 때까지 반복합니다.
    // -> 8이 나올 때까지 반복 즉 8,4,7,1 다음에 8번이 나오므로 종료

    // 이렇게 연 상자들은 1번 상자 그룹입니다. 이제 1번 상자 그룹을 다른 상자들과 섞이지 않도록 따로 둡니다.
    // 만약 1번 상자 그룹을 제외하고 남는 상자가 없으면 그대로 게임이 종료되며, 이때 획득하는 점수는 0점입니다.
    // 상자가 남아있으므로 0점 아님

    // 그렇지 않다면 남은 상자 중 다시 임의의 상자 하나를 골라 같은 방식으로 이미 열려있는 상자를 만날 때까지 상자를 엽니다.
    // 이렇게 연 상자들은 2번 상자 그룹입니다.
    // 위에 두번 반복

    // 1번 상자 그룹에 속한 상자의 수와 2번 상자 그룹에 속한 상자의 수를 곱한 값이 게임의 점수입니다.
    // 1번 상자 * 2번 상자가 정답

    public static void main(String[] args) {

        // 매개변수
        int[] cards = { 8, 6, 3, 7, 2, 5, 1, 4 };
        // hon_ja_jalnom 함수에서 리턴 받는 정답 출력
        System.out.println(hon_ja_jalnom(cards));
    }

    public static int hon_ja_jalnom(int[] cards) {
        // 첫번째 상자 그룹
        ArrayList<Integer> bang1 = new ArrayList<>();
        // 두번째 상자 그룹
        ArrayList<Integer> bang2 = new ArrayList<>();
        // 첫번째 상자가 끝나고 남은 상자
        ArrayList<Integer> cardsList = new ArrayList<>();
        // 연 상자들은 2번 상자 그룹을 확인하기 위해 만들어 놓은 자료구조
        // cards 길이 만큼 반복
        for (int i = 0; i < cards.length; i++) {
            // cards 길이 만큼 추가
            cardsList.add(cards[i]);
        }
        // 결과 변수
        int result = 0;

        // 테스트 변수들
        // int num = 0;
        // num = cards[0];
        // bang1.add(cards[num - 1]);
        // System.out.println(num);
        // result = bang1.get(0);

        // 순서에 따라 1번부터 순차적으로 증가하는 번호
        int i = 1;
        // 첫번째 값에서 빠져나오지 않게 하기 위해 만들어 준 변수
        int countNum = 1;
        // 두번쨰 상자 그룹에서 열어야 하는 상자가 이미 열려있을 때까지 반복하는 구문
        while (true) {
            // 첫번째 상자가 끝나고 남은 상자
            cardsList.remove(Integer.valueOf(i));
            if (countNum >= 3) {
                if (cards[0] == i) {
                    // 첫번째 상자중 변수가 중복되므로 제거
                    bang1.remove(0);
                    break;

                }
            }
            // 첫번쨰 상자 안에 넣기
            bang1.add(cards[i - 1]);
            // 이전 숫자에 담긴 번호를 다음 상자 번호로 변환
            i = cards[i - 1];

            // 결과 확인용
            // System.out.println(i);

            // 결과 확인용
            // System.out.println(bang1.get(0));

            // 첫번째 값에서 빠져나오지 않기 위해 만들어 준 변수 1씩 더하기
            countNum++;
        }

        // 테스트 구문
        // System.out.println("cardlist :");
        // System.out.println(cards[cardsList.get(0)]);
        // System.out.println(cardsList);

        // 두번쨰 상자 그룹에서 열어야 하는 상자가 이미 열려있을 때까지 반복하는 구문
        for (int j = 0; j < cardsList.size(); j++) {
            // System.out.println(cards[cardsList.get(j) - 1]);
            // 두번째 상자 추가
            bang2.add(cards[cardsList.get(j) - 1]);
            // 두번쨰 그룹 상자 번호와 카드 숫자가 같은 경우 삭제
            if (cardsList.get(j) == cards[cardsList.get(j) - 1]) {
                bang2.remove(Integer.valueOf(cards[cardsList.get(j) - 1]));
            }
        }

        // 첫번쨰 상자
        int bang1Num = bang1.size();
        // 두번째 상자
        int bang2Num = bang2.size();

        // System.out.println(bang2Num);

        // 결과 구하기
        result = bang1Num * bang2Num;

        return result;
    }

}