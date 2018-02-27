public class Expressions {

	public int expressions(int num) {
		int answer = 0;
		int tmpSum = 0;
		for(int i = num; i > 0; i--) {
			tmpSum =0;
			for(int j = i; j > 0; j--) {
				
				tmpSum += j;

				if(tmpSum == num) {
					answer++;
					break;
				}
				else if(tmpSum > num) {
					break;
				}
				else {}
			}
			
		}
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}
}