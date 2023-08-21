

public class Quiz11_2 {
	
	static String s = "abcdcba";
	
	public static void main(String[] args) {
		
		System.out.println(this_is_palindrome(s));

	}
	
	public static int this_is_palindrome(String s) {
		
		int answer = 0;
		
		int size = s.length();
		
		int max_length = Integer.MIN_VALUE;
		
		for (int i = 0; i < size; i++) {
			int left = i;
			int right = size - 1;
			int cur_length = 0;
			int idx = 1;
			
			while(left < right) {
				char left_c = s.charAt(left);
				char right_c = s.charAt(right);
				
				if (left_c == right_c) {
					left++;
					right--;
					cur_length += 2;
					
				} else {
					cur_length = 0;
					left = i;
					right = size - 1 - idx;
					idx++;
				}
			}
			
			if( left == right) {
				cur_length ++;
			}
			
			max_length = max_length > cur_length ? max_length : cur_length;
		}
		
		answer = max_length;
		
		return answer;
	}
	
}
