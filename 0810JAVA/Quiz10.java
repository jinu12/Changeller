import java.util.ArrayList;
import java.util.Arrays;

public class Quiz10 {

	public static void main(String[] args) {
		
		// 방이 비어있는 개수
		int k = 10;
		// 방을 원하는 번호
		int [] room_number = {1,3,4,1,3,1};
		
		// 결과 출력
		System.out.println(Arrays.toString(bang_jal_jum(k,room_number)));

	}
	
	static public int [] bang_jal_jum(int k, int [] room_number) {
		
		// 전체 방 번호를 담을 배열
		ArrayList<Integer> roomArr = new ArrayList<Integer>();
		for(int i = 1; i <k+1; i++) {
			roomArr.add(i);
		}
		
		// 결과를 저장할 배열
		int [] result = new int [room_number.length];
		
		// 남아 있는 방번호를 확인하기 위
		int count = 0;

		// 문제에서 주어진 방 번호 반복
		for(int i=0; i < room_number.length;i++) {
			// roomArr 어레이리스트에 방번호가 등록되어 있다면 그대로 출력
			if(roomArr.contains(room_number[i])) {
				System.out.println(room_number[i]);
				result[i] = room_number[i];
				roomArr.remove(Integer.valueOf(room_number[i]));
			}else {
				// 없으면 남은 방번호를 순서대로 출력
				result[i] = roomArr.get(count); 
				count++;
			}
			
		}
		// 결과 값 반환
		return result;
	}

}
