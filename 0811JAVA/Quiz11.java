public class Quiz11 {

	public static void main(String[] args) {
		// 주어진 문자열
		String  s = "abcdcba";
		// 뒤집어도 똑같은 개수 
		System.out.println(this_is_palindrome(s));
	}
	
	public static int this_is_palindrome(String s) {
		// 정답 출력
		int answer = 0;
		// 거꿀로 했을 때 count 수
		int count = 1;
		// 뒤접어도 똑같은 인덱스를 담을 정수 변수
		int value = 0;
		// 문자열 어레이리스트 만들기
		String [] sArr = s.split("");
		
		// 첫번째 문자와 같은 문자를 찾는 반복문
		for(int i = 1 ; i < sArr.length; i++) {
			if(sArr[0].equals(sArr[i])) {
				// 같은 배열을 찾으면 value 변수에 담기
				value = i;
				// 팰린드롬이 되므로 중간 값은 1 추가
				answer +=1;
			}
		}
		
		for(int i=0;i<value+1;i++) {
			if(i < (value+1)/2) {
				if(s.charAt(i) == s.charAt((value+1) - (1+i))) {
					// 거꿀로 했을 때 비슷하면 answer에 1 추가
					answer += 1;
				}
			}else {
				
				if(s.charAt(i) == s.charAt((value+1)/2 -count)) {
					// 거꿀로 했을 때 비슷하면 answer에 1 추가
					answer += 1;
					// 뒤 배열을 맞추기 위해 count에 1 추가
					count ++;
				}
			}
		}
		// 정답 반환
		return answer;
	}

}
