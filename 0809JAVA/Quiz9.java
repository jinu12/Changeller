public class Quiz9 {
	
	static public void main(String [] args) {
		
		int [] works = {4, 3, 3};
		int n = 4;
		
//		int [] works2 = {2, 1, 2};
//		int n2 = 1;
//		int [] works3 = {1, 1};
//		int n3 = 3;
		
		System.out.println(gae_p_gon_ham_principal(works, n));
		
	}
	
	static public int gae_p_gon_ham_principal(int [] works, int n) {
		
		int result = 0;
		
		for(int i = 0; i < works.length;i++) {
			if(i < works.length - 1) {
				if(works[i] >= works[i+1] && n != 0) {
					works[i] = works[i]- 1; 
					n = n -1;
					if(n >= works.length) {
						works[i] = works[i] - 1;
						works[i+1] = works[i+1] - 1;
						n = n -2;
					}
					System.out.println(n);
				}if(works[i] < works[i+1] && n != 0) {
					works[i+1] = works[i+1] - 1;
					n= n -1;
				}
			}
		}
		
		for(int temp : works) {
			result += Math.pow(temp,temp);
		}
		
		
		
		//빡침이는 N시간 동안 야근 피로도를 최소화하도록 일할 겁니다.
		//빡침이가 1시간 동안 작업량 1만큼을 처리할 수 있다고 할 때, 
		//야근 피로도는 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값입니다.

		return result;
		
	}

}