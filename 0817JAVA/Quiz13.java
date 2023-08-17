public class Quiz13 {

	static int storey = 16;
	
	public static void main(String[] args) {
		
		System.out.println(this_is_magicshow_haha(storey));
	}
	
	static public int this_is_magicshow_haha(int storey) {
		
		int answer = 0;
		int remainer = 0;
		
		// storey가 0 이상일 때 까지 반복
		while(storey > 0 ) {
			// 나머지
			remainer = storey  % 10;
			// 최소값을 구하기 위해야 되기때문에 절대값일때 제일 최소값이 나올 수 있는 경우를 해야함
			// 그래서 5이상이면은 그 이상의 값을 빼주고 5 미만이면은 나머지만큼만 빼줌
			// 하지만 5 일때는 10으로 나누고 나머지가 4이상이면 storey에 10을 더함
			if(remainer > 5) {
				answer += (10- remainer);
				storey += 10;
			}else if(remainer < 5) {
				answer += remainer;
			}else {
				if((storey / 10) % 10 > 4) {
					storey += 10;
				}
				answer += remainer;
			}
			// 10으로 나눴을 때 몫 그다음 반복
			storey /= 10;
		}
		
		return answer;
		
	}

}